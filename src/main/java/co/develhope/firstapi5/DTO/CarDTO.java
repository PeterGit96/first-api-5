package co.develhope.firstapi5.DTO;

import javax.validation.constraints.NotBlank;

public class CarDTO {

    @NotBlank (message = "Mandatory")
    private String id;
    @NotBlank (message = "Mandatory")
    private String modelName;
    private Double price;

    public CarDTO(String id, String modelName, Double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public Double getPrice() {
        return price;
    }

    public void getDetails() {
        System.out.printf("CAR - id: %s, model: %s, price: %s\n", id, modelName,
                price != null ? String.format("%.2f €", price) : price);
    }

}
