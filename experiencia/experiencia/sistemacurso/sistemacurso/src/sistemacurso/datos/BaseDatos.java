/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacurso.datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sistemacurso.pojos.CategoriaProd;
import sistemacurso.pojos.DetalleVenta;
import sistemacurso.pojos.Producto;
import sistemacurso.pojos.Proveedor;
import sistemacurso.pojos.Venta;

/**
 *
 * @author ferys
 */
public class BaseDatos {

    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    String nombreBD = "mydb";
    String usuario = "admincurso";
    String contraseña = "admin";

    public BaseDatos() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertarProducto(Producto producto) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            File fileFotoProducto = producto.getFotoProducto();
            FileInputStream fis = new FileInputStream(fileFotoProducto);

            //FileInputStream fis = new FileInputStream(producto.getFotoProducto());
            String sql = "INSERT INTO cat_productos (id_prod, desc_prod, stock_prod,"
                    + "foto_prod, unidad_prod, precio_compra_prod, precio_venta_prod, existencias_prod, id_categoria_prod,"
                    + "id_proveedor) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            st = conn.prepareStatement(sql);

            st.setInt(1, producto.getIdProducto());
            st.setString(2, producto.getNomProducto());
            st.setString(3, producto.getDescProducto());
            st.setDouble(4, producto.getStockProducto());
            st.setBinaryStream(5, fis, (int) producto.getFotoProducto().length());
            st.setString(6, producto.getUnidadProducto());
            st.setDouble(7, producto.getPrecioCompraProducto());
            st.setDouble(8, producto.getPrecioVentaProducto());
            st.setDouble(9, producto.getExistenciasProducto());
            st.setInt(10, producto.getIdCategoria());
            st.setInt(11, producto.getIdProveedor());

            st.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarCategoriaProducto(CategoriaProd categoria) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            String sql = "INSERT INTO cat_categorias (nom_categoria_prod,desc_categoria_prod) VALUES (?,?)";

            st = conn.prepareStatement(sql);

            st.setString(1, categoria.getNomCategoria());
            st.setString(2, categoria.getDescCategoria());

            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarProveedor(Proveedor prov) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            String sql = "INSERT INTO cat_proveedores (nom_proveedor, dir_proveedor, telefono_proveedor, email_proveedor"
                    + ", contacto_proveedor) VALUES (?,?,?,?,?)";

            st = conn.prepareStatement(sql);

            st.setString(1, prov.getNomProveedor());
            st.setString(2, prov.getDirProveedor());
            st.setString(3, prov.getTelProveedor());
            st.setString(4, prov.getEmailProveedor());
            st.setString(5, prov.getContactoProveedor());

            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarVenta(Venta venta) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            String sql = "INSERT INTO ventas (monto_venta, fecha_venta) VALUES (?,?)";

            st = conn.prepareStatement(sql);

            st.setDouble(1, venta.getMontoVenta());
            st.setDate(2, venta.getFechaVenta());

            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarDetalleVenta(DetalleVenta detalle) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            String sql = "INSERT INTO detalle_venta (id_venta,id_producto,cantidad_vendida) VALUES(?,?,?)";

            st = conn.prepareStatement(sql);

            st.setInt(1, detalle.getIdVenta());
            st.setInt(2, detalle.getIdProd());
            st.setDouble(3, detalle.getCantidadVendida());

            st.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ArrayList<Producto> obtenerProductos() {

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            String sql = "SELECT * FROM cat_productos";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_prod");
                String nombre = rs.getString("nombre_prod");
                String descripcion = rs.getString("desc_prod");
                double stock = rs.getDouble("stock_prod");
                String unidad = rs.getString("unidad_prod");
                double precioCompra = rs.getDouble("precio_compra_prod");
                double precioVenta = rs.getDouble("precio_venta_prod");
                double existencias = rs.getDouble("existencias_prod");
                int idCategoria = rs.getInt("id_categoria_prod");
                int idProveedor = rs.getInt("id_proveedor");

                Producto producto = new Producto(id, nombre, descripcion, stock, null, unidad, precioCompra, precioVenta, existencias, idCategoria, idProveedor);

                listaProductos.add(producto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaProductos;
    }

    public ArrayList<Proveedor> obtenerProveedores() {

        ArrayList<Proveedor> listaProveedores = new ArrayList<Proveedor>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            String sql = "SELECT * FROM cat_proveedores";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_proveedor");
                String nombre = rs.getString("nom_proveedor");
                String direccion = rs.getString("dir_proveedor");
                String telefono = rs.getString("telefono_proveedor");
                String email = rs.getString("email_proveedor");
                String contacto = rs.getString("contacto_proveedor");

                Proveedor proveedor = new Proveedor(id, nombre, direccion, telefono, email, contacto);
                listaProveedores.add(proveedor);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaProveedores;
    }

    public ArrayList<CategoriaProd> obtenerCategorias() {

        ArrayList<CategoriaProd> listaCategorias = new ArrayList<CategoriaProd>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBD + "?userTimezone=true&serverTimeZone=UTC", usuario, contraseña);
            String sql = "SELECT * FROM cat_categorias";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_categoria_prod");
                String nombre = rs.getString("nom_categoria_prod");
                String descripcion = rs.getString("desc_categoria_prod");

                CategoriaProd categoria = new CategoriaProd(id, nombre, descripcion);
                listaCategorias.add(categoria);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaCategorias;
    }

//    public static void main(String[] args) {
//        CategoriaProd categoria = new CategoriaProd(1, "Categoria de prueba", "prueba");
//        BaseDatos base = new BaseDatos();
//        base.insertarCategoriaProducto(categoria);
//    }
}
