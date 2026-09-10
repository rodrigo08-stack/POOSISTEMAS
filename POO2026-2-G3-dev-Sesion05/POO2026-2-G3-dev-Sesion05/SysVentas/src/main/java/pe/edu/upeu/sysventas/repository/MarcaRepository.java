package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.model.Marca;

public class MarcaRepository extends AbstractLpaRepository<Marca,Long>{
    private long sequence=1;
    @Override
    protected Long getId(Marca entity) {
        return entity.getIdMarca();
    }

    @Override
    protected void setid(Marca entity, Long id) {
        entity.setIdMarca(id);

    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
