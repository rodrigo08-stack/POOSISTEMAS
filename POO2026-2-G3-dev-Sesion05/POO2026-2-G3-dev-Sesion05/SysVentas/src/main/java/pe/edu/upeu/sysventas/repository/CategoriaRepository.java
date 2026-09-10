package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.model.Categoria;

public class CategoriaRepository extends AbstractLpaRepository<Categoria, Long> {
    private  long sequence=1;

    @Override
    protected Long getId(Categoria entity) {

        return entity.getIdCategoria();
    }

    @Override
    protected void setid(Categoria entity, Long id) {
        entity.setIdCategoria(id);

    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
