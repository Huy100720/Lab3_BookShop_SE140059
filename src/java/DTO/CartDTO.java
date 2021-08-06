package DTO;

import java.util.HashMap;
import java.util.Map;

public class CartDTO {

    private Map<String, BookDTO> cart;

    public CartDTO() {
    }

    public CartDTO(Map<String, BookDTO> cart) {
        this.cart = cart;
    }

    public Map<String, BookDTO> getCart() {
        return cart;
    }

    public void setCart(Map<String, BookDTO> cart) {
        this.cart = cart;
    }

    public void add(BookDTO book) {
        if (this.cart == null) {
            this.cart = new HashMap<>();
        }
        if (this.cart.containsKey(book.getBookID())) {
            int quantity = this.cart.get(book.getBookID()).getQuantity();
            book.setQuantity(quantity + 1);
        }
        cart.put(book.getBookID(), book);
    }

    public void deltete(String id) {
        if (this.cart == null) {
            return;
        }
        if (this.cart.containsKey(id)) {
            this.cart.remove(id);
        }
    }

    public void update(String id, BookDTO book) {
        if (this.cart == null) {
            return;
        }
        if (this.cart.containsKey(id)) {
            this.cart.replace(id, book);
        }
    }

    public void pay(BookDTO book, int cartQuantity) {
        if (this.cart != null) {
            if (this.cart.containsKey(book.getBookID())) {
                int quantity = this.cart.get(book.getBookID()).getQuantity();
                book.setQuantity(quantity - cartQuantity);
            }
        }
        cart.put(book.getBookID(), book);
    }
    
    
    
}
