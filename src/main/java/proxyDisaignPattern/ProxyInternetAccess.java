package proxyDisaignPattern;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private String employeeName;
    private RealInternetAccess  realaccess;
    public ProxyInternetAccess (String employeeName){
        this.employeeName=employeeName;
    }
    public int getRole(String emplName){
        return  3; }
    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName)>2){
            realaccess=new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
        }else{
            System.out.println(" no internet access granted");
        }

        }
}
