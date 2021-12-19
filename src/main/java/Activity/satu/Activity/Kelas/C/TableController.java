/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity.satu.Activity.Kelas.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS ROG
 */
@Controller
public class TableController {
    
    @RequestMapping("/dataktp")
    //@ResponseBody
    public String getTable(Model penduduk){
        String result = "Tabel Kependudukan Warga UMY";
        penduduk.addAttribute("DataWarga", result);
        
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(0,Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
        data.add(1,Arrays.asList("001","2899011289640304","Muhammad Rizkan","Bandongan"));
        data.add(2,Arrays.asList("002","4154391478551532","Soleh Solehudin","Kasihan"));
        data.add(3,Arrays.asList("003","4965650623848085","Kania Syifa Aziza","Majalengka"));
        data.add(4,Arrays.asList("004","9158769848001616","Deden Clay Muhammad","Jakarta Barat"));
        data.add(5,Arrays.asList("005","5346826750707444","Eko Juliansah","Semarang"));
        data.add(6,Arrays.asList("006","2637076284120118","Dhani Alamsyah","Wonosobo"));
        data.add(7,Arrays.asList("007","5691230229287250","Wida Sulistyo","Dieng"));
        data.add(8,Arrays.asList("008","4746080178788587","Bagus Prakoso","Salaman"));
        data.add(9,Arrays.asList("009","0668870169643894","Vior Vanisti","Maluku Utara"));
        data.add(10,Arrays.asList("010","6431338148761512","Anang Hermawan","Jakarta Utara"));
        data.add(11,Arrays.asList("011","2172906956266179","Danang Wibisono","Godean"));
        data.add(12,Arrays.asList("012","8341112952284604","Raditya Danakusuma","Sleman"));
        data.add(13,Arrays.asList("013","5077810262908567","Yurino","Nusa Tenggara Timur"));
        data.add(14,Arrays.asList("014","8566086572865103","Sutanto","Gondokusuman"));
        data.add(15,Arrays.asList("015","4975157107177498","Kayesa Adeliana","Banguntapan"));
        data.add(16,Arrays.asList("016","9589069444565871","Gebi Anastasya","Kaliurang"));
        data.add(17,Arrays.asList("017","6257658410182719","Ghea Agatha","Borobudur"));
        data.add(18,Arrays.asList("018","4575868210429307","Drian Muhammad","Jepara"));
        data.add(19,Arrays.asList("019","7777600319682143","Fariza Sativa","Kudus"));
        data.add(20,Arrays.asList("020","7197776121158685","Alicia Patricia","Flores"));
        
        
        
        
        
        
        penduduk.addAttribute("tabel", data);
        
        return "tableviewer";
    }
    
    
}
