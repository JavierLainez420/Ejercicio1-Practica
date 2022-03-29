
package ejercicio1.practica;

public class Empleado {

    String nombre;
    String cargo;
    double pagoH;
    double renta;
    double salarioBr;
    double salarioLiq;
    int horasT;
    int horasEx;
    int horasExx;

    public Empleado(String nombre, String cargo, double pagoH, double renta, double salarioBr, double salarioLiq, int horasT, int horasEx, int horasExx) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.pagoH = pagoH;
        this.renta = renta;
        this.salarioBr = salarioBr;
        this.salarioLiq = salarioLiq;
        this.horasT = horasT;
        this.horasEx = horasEx;
        this.horasExx = horasExx;
    }
    
    public Empleado(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getPagoH() {
        return pagoH;
    }

    public void setPagoH(double pagoH) {
        this.pagoH = pagoH;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getSalarioBr() {
        return salarioBr;
    }

    public void setSalarioBr(double salarioBr) {
        this.salarioBr = salarioBr;
    }

    public double getSalarioLiq() {
        return salarioLiq;
    }

    public void setSalarioLiq(double salarioLiq) {
        this.salarioLiq = salarioLiq;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public int getHorasEx() {
        return horasEx;
    }

    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }

    public int getHorasExx() {
        return horasExx;
    }

    public void setHorasExx(int horasExx) {
        this.horasExx = horasExx;
    }
    
    
   public String Informacion (Empleado e){
   String datos = "\n";
   datos += "Nombre: " + e.getNombre() + "\n";
   datos += "Cargo: " + e.getCargo() + "\n";
   return datos;
   }
    
  
    
    double salarioSimple (Empleado e){
        double re;
        re = 40 * e.pagoH   ;
        return re;
    }
    
    public String calHorasEx (Empleado e){
        String realizoEx = "";
        double horas, pagoH, salariosimple, pagoHex, salarioBr;
        horas = e.horasT;
        pagoH = e.pagoH;
        salariosimple = e.salarioSimple(e);
        
        if(horas <= 40){
            realizoEx += "El empleado no ha realizado horas extras"; 
            pagoHex = (horas * pagoH);
            e.salarioBr += salariosimple;
                        
        }
        else if(horas >40 && horas <= 48) {
        horas = horas-40;
        realizoEx += "El empleado realizo " + horas +  " horas extras que se le pagaran al doble";
        pagoHex = (horas * pagoH) * 2;
        e.salarioBr = pagoHex + salariosimple;            
      
        }
        else if(horas > 48 ){
            horas = horas-48;
            realizoEx += "El empleado realizo 8 horas extras que se le pagaran al doble y " + (e.horasT - 48) + " que se le pagaran al triple" ;
            pagoHex = (8 * pagoH) * 2;
            pagoHex += (horas * pagoH) * 3; 
            e.salarioBr = pagoHex + salariosimple; 
        
        }
        
          
          return realizoEx;
    }

    double renta (Empleado e){
    double des;
    des = e.salarioBr * 0.10;
    return des;
    
    }
    
        double salarioBruto(Empleado e){
    double salariobr;
    salariobr = e.salarioBr;
    return salariobr;
    }
    
    
    double salarioLiquido (Empleado e){
    double salarioLiq;
    salarioLiq = e.salarioBr - e.renta; 
    return salarioLiq;
    }
    

    
}
