function eliminarUsuario(Cedula)
{
    swal({
            title: "Esta seguro de Eliminar el usuario?",
            text: "Una vez eliminado el usuario no puede ser recuperado!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
            .then((OK) => {
                if (OK) {
                    $.ajax({
                        url:"/eliminarUsuario/"+Cedula,
                        success: function(res){
                            console.log(res);
                    }
                });
                swal("Poof! el Usuario ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/listarUsuario";
                    }
                });
            } else {
                swal("El Usuario NO se ha eliminado!");
            }
        });
}

function eliminarCliente(Cedula)
{
    swal({
            title: "Esta seguro de Eliminar el cliente?",
            text: "Una vez eliminado el cliente no puede ser recuperado!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
            .then((OK) => {
                if (OK) {
                    $.ajax({
                        url:"/eliminarCliente/"+Cedula,
                        success: function(res){
                            console.log(res);
                    }
                });
                swal("Poof! el Cliente ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/listarCliente";
                    }
                });
            } else {
                swal("El cliente NO se ha eliminado!");
            }
        });
}

function eliminarProveedor(nit)
{
    swal({
            title: "Esta seguro de Eliminar el proveedor?",
            text: "Una vez eliminado el proveedor no puede ser recuperado!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
            .then((OK) => {
                if (OK) {
                    $.ajax({
                        url:"/eliminarProveedor/"+nit,
                        success: function(res){
                            console.log(res);
                    }
                });
                swal("Poof! el Proveedor ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/listarProveedor";
                    }
                });
            } else {
                swal("El proveedor NO se ha eliminado!");
            }
        });
}

function eliminarProducto(codigo)
{
    swal({
            title: "Esta seguro de Eliminar el producto?",
            text: "Una vez eliminado el producto no puede ser recuperado!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
            .then((OK) => {
                if (OK) {
                    $.ajax({
                        url:"/eliminarProducto/"+codigo,
                        success: function(res){
                            console.log(res);
                    }
                });
                swal("Poof! el Producto ha sido eliminado!", {
                    icon: "success",
                }).then((ok) => {
                    if(ok){
                        location.href="/listarProducto";
                    }
                });
            } else {
                swal("El producto NO se ha eliminado!");
            }
        });
}