package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.model.Producto;

public class ProductoRepository extends AbstractLpaRepository<Producto,Long>{
    private long sequence=1;
    @Override
    protected Long getId(Producto entity) {
        return entity.getIdProducto();
    }

    @Override
    protected void setid(Producto entity, Long id) {
        entity.setIdProducto(id);

    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
