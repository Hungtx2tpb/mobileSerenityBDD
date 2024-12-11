package bb.data;

import java.util.Arrays;
import java.util.List;

public class MoneyTransferValue {

    //AMOUNT
    public static final String AMOUNT = "10000";

    //MESSAGE
    public static final String MESSAGE = "Auto test";

    //MONEY SUGGEST
    public static final List<String> MONEY_SUGGEST = Arrays.asList("mua hang", "an sang", "cafe", "an trua", "an toi", "tra no", "hoc phi", "thue nha", "chuc mung");

    //STATUS
    public static final String STATUS_SUCCESS = "Giao Dịch Thành Công!";
    public static final String STATUS_SUCCESS_1 = "Giao Dịch Đã Được TPBank\nThực Hiện";
    public static final String STATUS_PLACE_SCHEDULED_MONEY_ORDER = "Đã Đặt Lệnh Chuyển Tiền Theo Lịch!";
    public static final String STATUS_UPDATED_SCHEDULED_MONEY_ORDER = "Đã Cập Nhật Lệnh Chuyển Tiền";
    public static final String STATUS_MONEY_TRANSFER_NORMAL = "Giao Dịch Đã Được TPBank Thực Hiện!";
    public static final String STATUS_MONEY_TRANSFER_GUARANTEED = "Chuyển Tiền Đảm Bảo Thành Công!";
    public static final String STATUS_MONEY_TRANSFER_BY_LIST = "Ghi Nhận Lệnh Chuyển Tiền Theo Danh Sách Thành Công";
    public static final String STATUS_MONEY_TRANSFER_STOCK = "Chuyển Tiền Chứng Khoán Thành Công!";

    //In TP Bank
    public static final String ACCOUNT_MONEY_TRANSFER = "00000162689";
    public static final String IN_TPB_ACCOUNT_NUMBER = "01207038002";
    public static final String MY_ACCOUNT_NUMBER = "0000 0162 794";
    public static final String IN_TPB_PHONE_NUMBER = "09061991001";
    public static final String IN_TPB_ALIAS = "testvietqr2022";
    public static final String IN_TPB_ALIAS_2 = "shopnametest";
    public static final String IN_TPB_RECEIVER_NAME = "CUSTOMER01207038";

    //LNH
    public static final String LNH_BANK_CODE = "NCB";
    public static final String LNH_BANK_NAME = "Ngân hàng Quốc Dân";
    public static final String LNH_ACCOUNT_NUMBER = "010247910";
    public static final String LNH_ACCOUNT_NUMBER_1 = "111111111";
    public static final String LNH_PROVINCE = "Hà Nội";
    public static final String LNH_RECEIVER_NAME = "Nguyen Van Test";
    public static final String LNH_RECEIVER_NAME_1 = "NGUYEN VAN A";

    //ATM
    public static final String ATM_RECEIVER_NAME = "NGUYEN VAN SAU";
    public static final String ATM_NUMBER_CARD = "9704150000270016";

    //Stock
    public static final String STOCK_SUB_ACCOUNT_TPS = " Thường ";
    public static final String STOCK_ACCOUNT_NUMBER_TPS = "003985";
    public static final String STOCK_SUB_ACCOUNT_FPTS = " Cơ sở ";
    public static final String STOCK_ACCOUNT_NUMBER_FPTS = "058C123456";
    public static final String STOCK_RECEIVER_NAME_FPTS = "NGUYEN VAN A";

    //Template
    public static final String TEMPLATE_INTERNAL = "Internal";
    public static final String TEMPLATE_INTERBANK = "Interbank";
    public static final String TEMPLATE_ATM = "ATM";
    public static final String TEMPLATE_ALIAS = "ALIAS";
    public static final String TEMPLATE_STOCK_TPS = "CHUNG KHOAN TPS";
    public static final String TEMPLATE_STOCK_FPTS = "CHUNG KHOAN FPTS";

    //Services
    public static final String SERVICES_INTERNAL = "Trong TPBank";
    public static final String SERVICES_INTERBANK = "Liên Ngân Hàng";
    public static final String SERVICES_ATM = "Thẻ ATM";

    //Money transfer type
    public static final String MONEY_TRANSFER_INTERNAL = "Chuyển tiền trong TPBank";
    public static final String MONEY_TRANSFER_INTERBANK = "Chuyển tiền liên ngân hàng";
    public static final String MONEY_TRANSFER_ATM = "Chuyển tiền qua thẻ ATM";
    public static final String MONEY_TRANSFER_STOCK = "Chuyển tiền qua thẻ ATM";

}
