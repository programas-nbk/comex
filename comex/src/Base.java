class Base {
    int id;
    int setId(int id) {
        int ultimoId = id + 1;
        this.id = ultimoId;
        return ultimoId;
    }
}
