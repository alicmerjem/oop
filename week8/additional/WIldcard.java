package week8.additional;

import java.util.List;

public class WIldcard {
public void printList(List<?> list) {
    for (Object elem : list) {
        System.out.println(elem);
    }
}  
}

