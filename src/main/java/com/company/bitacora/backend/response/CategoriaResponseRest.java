package com.company.bitacora.backend.response;

public class CategoriaResponseRest extends ResponseRest{

    private CategoriaResponse categoriaResponse = new CategoriaResponse();

    public CategoriaResponse getCategoriaResponse() {
        return categoriaResponse;
    }

    public void setCategoriaResponse(CategoriaResponse categoriaResponse) {
        this.categoriaResponse = categoriaResponse;
    }
}
