class FirstClass {
    Integer id;
    String title;
    Boolean isBlocked;
    Float rating;
    def binding

    FirstClass(Integer id, String title, Boolean isBlocked, Float rating) {
        this.id = id
        this.title = title
        this.isBlocked = isBlocked
        this.rating = rating
    }

    String getTitle() {
        return title
    }

    FirstClass() {
        this.binding = new Binding(id: 2, title: "notBind", isBlocked: false, rating: 23)
    }

    Integer getId() {
        id
    }
}