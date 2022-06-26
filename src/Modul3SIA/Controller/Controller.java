package Modul3SIA.Controller;

import Modul3SIA.Model.*;

public class Controller implements InterfaceStatus {

    InitData data = new InitData();

    public String userData(String nama) {
        boolean found = false;
        String output = "";
        for (int i = 0; i < data.daftarMhsSarjana.size(); i++) {
            if (nama.equals(data.daftarMhsSarjana.get(i).getNama())) {
                found = true;
                output = data.daftarMhsSarjana.get(i).toString();
                break;
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarMhsMagister.size(); i++) {
                if (nama.equals(data.daftarMhsMagister.get(i).getNama())) {
                    found = true;
                    output = data.daftarMhsMagister.get(i).toString();
                    break;
                }
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarMhsDoktor.size(); i++) {
                if (nama.equals(data.daftarMhsDoktor.get(i).getNama())) {
                    output = data.daftarMhsDoktor.get(i).toString();
                    break;
                }
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarDosenTetap.size(); i++) {
                if (nama.equals(data.daftarDosenTetap.get(i).getNama())) {
                    output = data.daftarDosenTetap.get(i).toString();
                    break;
                }
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarDosenHonorer.size(); i++) {
                if (nama.equals(data.daftarDosenHonorer.get(i).getNama())) {
                    output = data.daftarDosenHonorer.get(i).toString();
                    break;
                }
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarKaryawan.size(); i++) {
                if (nama.equals(data.daftarKaryawan.get(i).getNama())) {
                    output = data.daftarKaryawan.get(i).toString();
                    break;
                }
            }
        }
        if ("".equals(output)) {
            output = "Nama tidak tersedia";
        }
        return output;
    }

    public double nilaiAkhir(String nim, String kodeMK) {
        String dataNIM;
        String dataKode;
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        for (int i = 0; i < data.daftarMhsSarjana.size(); i++) {
            dataNIM = data.daftarMhsSarjana.get(i).getNIM();
            if (dataNIM.equals(nim)) {
                for (int j = 0; j < data.daftarMhsSarjana.get(i).getListMatkul().size(); j++) {
                    dataKode = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getKode();
                    if (dataKode.equals(kodeMK)) {
                        nilai1 = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN1();
                        nilai2 = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN2();
                        nilai3 = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN3();
                        return (nilai1 + nilai2 + nilai3) / 3;
                    }
                }
            }
        }
        for (int i = 0; i < data.daftarMhsMagister.size(); i++) {
            dataNIM = data.daftarMhsMagister.get(i).getNIM();
            if (dataNIM.equals(nim)) {
                for (int j = 0; j < data.daftarMhsMagister.get(i).getListMatkul().size(); j++) {
                    dataKode = data.daftarMhsMagister.get(i).getListMatkul().get(j).getKode();
                    if (dataKode.equals(kodeMK)) {
                        nilai1 = data.daftarMhsMagister.get(i).getListMatkul().get(j).getN1();
                        nilai2 = data.daftarMhsMagister.get(i).getListMatkul().get(j).getN2();
                        nilai3 = data.daftarMhsMagister.get(i).getListMatkul().get(j).getN3();
                        return (nilai1 + nilai2 + nilai3) / 3;
                    }
                }
            }
        }
        for (int i = 0; i < data.daftarMhsDoktor.size(); i++) {
            dataNIM = data.daftarMhsDoktor.get(i).getNIM();
            if (dataNIM.equals(nim)) {
                nilai1 = data.daftarMhsDoktor.get(i).getNilaiSidang1();
                nilai2 = data.daftarMhsDoktor.get(i).getNilaiSidang2();
                nilai3 = data.daftarMhsDoktor.get(i).getNilaiSidang3();
                return (nilai1 + nilai2 + nilai3) / 3;
            }
        }
        return 1;
    }

    public double rataNilaiAkhir(String kodeMK) {
        String dataKode;
        int nilai = 0;
        double rata = 0;
        int jumlahMhs = 0;
        for (int i = 0; i < data.daftarMhsSarjana.size(); i++) {
            for (int j = 0; j < data.daftarMhsSarjana.get(i).getListMatkul().size(); j++) {
                dataKode = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getKode();
                if (dataKode.equals(kodeMK)) {
                    nilai = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN1();
                    nilai += data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN2();
                    nilai += data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN3();
                    rata += nilai / 3;
                    jumlahMhs++;
                }
            }
        }
        for (int i = 0; i < data.daftarMhsMagister.size(); i++) {
            for (int j = 0; j < data.daftarMhsMagister.get(i).getListMatkul().size(); j++) {
                dataKode = data.daftarMhsMagister.get(i).getListMatkul().get(j).getKode();
                if (dataKode.equals(kodeMK)) {
                    nilai = data.daftarMhsMagister.get(i).getListMatkul().get(j).getN1();
                    nilai += data.daftarMhsMagister.get(i).getListMatkul().get(j).getN2();
                    nilai += data.daftarMhsMagister.get(i).getListMatkul().get(j).getN3();
                    rata += nilai / 3;
                    jumlahMhs++;
                }
            }

        }
        return rata / jumlahMhs;
    }

    public String cekLulus(String kodeMK) {
        int jumlahTakLulus = 0;
        int totalMhs = 0;
        String namaMK = "";
        String dataKode;
        int nilai = 0;
        double hasil = 0;
        for (int i = 0; i < data.daftarMhsSarjana.size(); i++) {
            for (int j = 0; j < data.daftarMhsSarjana.get(i).getListMatkul().size(); j++) {
                dataKode = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getKode();
                if (dataKode.equals(kodeMK)) {
                    namaMK = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getNama();
                    nilai = data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN1();
                    nilai += data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN2();
                    nilai += data.daftarMhsSarjana.get(i).getListMatkul().get(j).getN3();
                    hasil = nilai / 3;
                    totalMhs++;
                    if (hasil < 56) {
                        jumlahTakLulus++;
                    }
                }
            }
        }
        for (int i = 0; i < data.daftarMhsMagister.size(); i++) {
            for (int j = 0; j < data.daftarMhsMagister.get(i).getListMatkul().size(); j++) {
                dataKode = data.daftarMhsMagister.get(i).getListMatkul().get(j).getKode();
                if (dataKode.equals(kodeMK)) {
                    nilai = data.daftarMhsMagister.get(i).getListMatkul().get(j).getN1();
                    nilai += data.daftarMhsMagister.get(i).getListMatkul().get(j).getN2();
                    nilai += data.daftarMhsMagister.get(i).getListMatkul().get(j).getN3();
                    hasil += nilai / 3;
                    totalMhs++;
                    if (hasil < 56) {
                        jumlahTakLulus++;
                    }
                }
            }

        }
        return jumlahTakLulus + " dari " + totalMhs + " mahasiswa tidak lulus matkul " + namaMK;
    }

    public String presensiMatkul(String nim) {
        String dataNIM;
        int indexMhs = -1;  // -1 == mhs belum ditemukan
        String output = "";
        for (int i = 0; i < data.daftarMhsSarjana.size(); i++) {
            dataNIM = data.daftarMhsSarjana.get(i).getNIM();
            if (dataNIM.equals(nim)) {
                indexMhs = i;
                output += "Mahasiswa sarjana NIM " + nim + " mengambil matkul:\n";
                for (int j = 0; j < data.daftarMhsSarjana.get(indexMhs).getListMatkul().size(); j++) {
                    int hadir = 0;
                    output += "- " + data.daftarMhsSarjana.get(indexMhs).getListMatkul().get(j).getNama() + ", Total presensi = ";
                    for (int k = 0; k < data.daftarMhsSarjana.get(indexMhs).getListMatkul().get(j).getListPresensi().size(); k++) {
                        if (data.daftarMhsSarjana.get(indexMhs).getListMatkul().get(j).getListPresensi().get(k).getStatus() == InterfaceStatus.HADIR) {
                            hadir++;
                        }
                    }
                    output += hadir + "\n";
                }
                break;
            }
        }
        if (indexMhs == -1) {
            for (int i = 0; i < data.daftarMhsMagister.size(); i++) {
                dataNIM = data.daftarMhsMagister.get(i).getNIM();
                if (dataNIM.equals(nim)) {
                    indexMhs = i;
                    output += "Mahasiswa Magister NIM " + nim + " mengambil matkul:\n";
                    for (int j = 0; j < data.daftarMhsMagister.get(indexMhs).getListMatkul().size(); j++) {
                        int hadir = 0;
                        output += "- " + data.daftarMhsMagister.get(indexMhs).getListMatkul().get(j).getNama() + ", Total presensi = ";
                        for (int k = 0; k < data.daftarMhsMagister.get(indexMhs).getListMatkul().get(j).getListPresensi().size(); k++) {
                            if (data.daftarMhsMagister.get(indexMhs).getListMatkul().get(j).getListPresensi().get(k).getStatus() == InterfaceStatus.HADIR) {
                                hadir++;
                            }
                        }
                        output += hadir + "\n";
                    }
                    break;
                }
            }
        }
        return output;
    }

    public int jamDosenNgajar(String nik) {
        int totalJam = 0;
        boolean found = false;
        String dataNIK;
        for (int i = 0; i < data.daftarDosenTetap.size(); i++) {
            dataNIK = data.daftarDosenTetap.get(i).getNIK();
            if (dataNIK.equals(nik)) {
                found = true;
                for (int j = 0; j < data.daftarDosenTetap.get(i).getListMatkulDiajar().size(); j++) {
                    for (int k = 0; k < data.daftarDosenTetap.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().size(); k++) {
                        if (data.daftarDosenTetap.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getStatus() == InterfaceStatus.HADIR) {
                            totalJam += data.daftarDosenTetap.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getJam();
                        }
                    }
                }
                break;
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarDosenHonorer.size(); i++) {
                dataNIK = data.daftarDosenHonorer.get(i).getNIK();
                if (dataNIK.equals(nik)) {
                    found = true;
                    for (int j = 0; j < data.daftarDosenHonorer.get(i).getListMatkulDiajar().size(); j++) {
                        for (int k = 0; k < data.daftarDosenHonorer.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().size(); k++) {
                            if (data.daftarDosenHonorer.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getStatus() == InterfaceStatus.HADIR) {
                                totalJam += data.daftarDosenHonorer.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getJam();
                            }
                        }
                    }
                    break;
                }
            }
        }
        return totalJam;
    }

    public int hitungGaji(String nik) {
        int gaji = 0;
        int jumlahHadir = 0;
        boolean found = false;
        String dataNIK;
        for (int i = 0; i < data.daftarDosenTetap.size(); i++) {
            dataNIK = data.daftarDosenTetap.get(i).getNIK();
            if (dataNIK.equals(nik)) {
                found = true;
                for (int j = 0; j < data.daftarDosenTetap.get(i).getListMatkulDiajar().size(); j++) {
                    for (int k = 0; k < data.daftarDosenTetap.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().size(); k++) {
                        if (data.daftarDosenTetap.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getStatus() == InterfaceStatus.HADIR) {
                            jumlahHadir++;
                        }
                    }
                }
                gaji = data.daftarDosenTetap.get(i).getSalary() + (jumlahHadir * 25000);
                break;
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarDosenHonorer.size(); i++) {
                dataNIK = data.daftarDosenHonorer.get(i).getNIK();
                if (dataNIK.equals(nik)) {
                    found = true;
                    for (int j = 0; j < data.daftarDosenHonorer.get(i).getListMatkulDiajar().size(); j++) {
                        for (int k = 0; k < data.daftarDosenHonorer.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().size(); k++) {
                            if (data.daftarDosenHonorer.get(i).getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getStatus() == InterfaceStatus.HADIR) {
                                jumlahHadir++;
                            }
                        }
                    }
                    gaji = jumlahHadir * data.daftarDosenHonorer.get(i).getHonorPerSKS();
                    break;
                }
            }
        }
        if (!found) {
            for (int i = 0; i < data.daftarKaryawan.size(); i++) {
                dataNIK = data.daftarKaryawan.get(i).getNIK();
                if (dataNIK.equals(nik)) {
                    found = true;
                    for (int j = 0; j < data.daftarKaryawan.get(i).getListPresensiStaff().size(); j++) {
                        if (data.daftarKaryawan.get(i).getListPresensiStaff().get(j).getStatus()== InterfaceStatus.HADIR) {
                            jumlahHadir++;
                        }
                    }
                    gaji = jumlahHadir / 22 * data.daftarKaryawan.get(i).getSalary();
                    break;
                }
            }
        }
        return gaji;
    }
}
