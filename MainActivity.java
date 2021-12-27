package example.javatpoint.com.qrcodebarcodescanner;  
  
import android.content.Intent;  
import android.support.v7.app.AppCompatActivity;  
import android.os.Bundle;  
import android.view.View;  
import android.widget.Button;  
  
public class MainActivity extends AppCompatActivity {  
    Button  btnScanBarcode;  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        btnScanBarcode = findViewById(R.id.btnScanBarcode);  
  
        btnScanBarcode.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View view) {  
                startActivity(new Intent(MainActivity.this, ScannedBarcodeActivity.class));  
            }  
        });  
    }  
}  