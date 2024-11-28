package baitap.Lab8Hoc;

public interface IAnimal {

   //- Interface là một cách khác để thực hiện tính "kế thừa/Inherit" trong java (bên cạnh abstract class)
    //- Là một tập hợp của các methods (không có body)
    //Để truy cập/sử dụng 1 interface, chúng ta sử dụng keyword "Implements" (thay vì extends),
    // và class sử dụng interface bắt buộc phải ghi đè các methodscó trong interface (ngoại trừ default method)
    //Để đa kế thừa trong interface thì dùng cú pháp "tên interface".super.



    void animalSound(); // interface method (does not have a body)
    void run(); // interface method (does not have a body)
}
