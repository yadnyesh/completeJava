package yb.yadnyesh.udemy.ds.paraasync.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOption {
    private Integer productOptionId;
    private String size;
    private String color;
    private double price;
    private Inventory inventory;
}
