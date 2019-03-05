package com.yf.btp;

import android.graphics.Bitmap;
import android.view.View;

public interface IPrinterFeatures {

    boolean isValid();

    String getSelectedDevName();

    int printView(View v);

    int printBitmap(Bitmap bm);

    int openPort(int printerId, String deviceMac);

    void closePort(int PrinterId);

    int getPrinterConnectStatus(int PrinterId);

    int printeTestPage(int PrinterId);

    void queryPrinterStatus(int PrinterId, int Timesout, int requestCode);

    int getPrinterCommandType(int PrinterId);

    int sendEscCommand(int PrinterId, String b64);

    int sendLabelCommand(int PrinterId, String b64);

    void isUserExperience(boolean userExperience);

    String getClientID();

    int setServerIP(String ip, int port);

}
