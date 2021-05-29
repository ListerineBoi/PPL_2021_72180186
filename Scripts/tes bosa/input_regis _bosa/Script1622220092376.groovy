import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ti.ukdw.ac.id/~anton/sibaru/registrasi')

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nama lengkap sesuai dengan yang terte_962511'), 
    nama)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nomor Induk Siswa Nasional. Sesuai Ij_c4ff17'), 
    no_induk)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/select_Laki-lakiPerempuan'), 
    jk, true)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tempat kota kelahiran.Jika lahir di l_982123'), 
    tmpt_lhr)

WebUI.setText(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanggal'), tgl_lahir)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/select_Pilih AgamaKristenKatolikIslamHinduB_b43882'), 
    agama, true)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/textarea_Alamat_alamat'), 
    almt)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Email Aktif Calon Peserta Didik_email_09701a'), 
    email)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nomor HP calon peserta didik yang akt_1f5f57'), 
    hp)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nomor WhatsApp calon peserta didik ya_62f09f'), 
    whatsapp)

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/i_Back_zmdi zmdi-arrow-right'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nama Sekolah Asal_sekolah_asal'), 
    sekolah)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/textarea_Sesuai dengan keterangan pada doku_554ead'), 
    almtSk)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nomor telepon kantor SMP yang dapat d_2b2654'), 
    notelpS)

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/i_Back_zmdi zmdi-arrow-right'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Kelas VII Semester 1_nilai_vii_i'), 
    nilaikelas7_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Kelas VII Semester 2_nilai_vii_ii'), 
    nilaikelas7_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Kelas VII Semester 1_nilai_viii_i'), 
    nilaikelas8_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Kelas VIII Semester 2_nilai_viii_ii'), 
    nilaikelas8_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Kelas IX Semester 1_nilai_ix_i'), 
    nilaikelas9_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Kelas IX Semester 2_nilai_ix_ii'), 
    nilaikelas9_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Sakit_sakit_vii_i'), 
    sakitkelas7_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Ijin_ijin_vii_i'), 
    ijinkelas7_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanpa Keterangan_tk_vii_i'), 
    Akelas7_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Sakit_sakit_vii_ii'), 
    sakitkelas7_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Ijin_ijin_vii_ii'), 
    ijinkelas7_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanpa Keterangan_tk_vii_ii'), 
    Akelas7_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Sakit_sakit_viii_i'), 
    sakitkelas8_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Ijin_ijin_viii_i'), 
    ijinkelas8_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanpa Keterangan_tk_viii_i'), 
    Akelas8_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Sakit_sakit_viii_ii'), 
    sakitkelas8_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Ijin_ijin_viii_ii'), 
    ijinkelas8_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanpa Keterangan_tk_viii_ii'), 
    Akelas8_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Sakit_sakit_ix_i'), 
    sakitkelas9_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Ijin_ijin_ix_i'), 
    ijinkelas9_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanpa Keterangan_tk_ix_i'), 
    Akelas9_1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Sakit_sakit_ix_ii'), 
    sakitkelas9_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Ijin_ijin_ix_ii'), 
    ijinkelas9_2)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanpa Keterangan_tk_ix_ii'), 
    Akelas9_2)

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/i_Back_zmdi zmdi-arrow-right'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nama lengkap Ayah sesuai dengan yang _a458b8'), 
    namaA)

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tempat kota kelahiran. Jika lahir di _8d2888'))

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tempat kota kelahiran. Jika lahir di _8d2888'), 
    tmpt_lhrA)

WebUI.setText(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanggal Lahir Ayah_tgl_lahir_ayah'), 
    tgl_lahirA)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/select_PendidikanSMAS1S2S3lainnya'), 
    pendA, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/select_Pilih AgamaKristenKatolikIslamHinduB_b43882_1'), 
    agamaA, true)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Pekerjaan atau usaha yang dilakukan A_159e70'), 
    kerjaA)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Jumlah rata-rata penghasilan perbulan_308f92'), 
    gajiA)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nomor HP Ayah dari calon peserta didi_2be889'), 
    telpA)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nama lengkap Ibu sesuai dengan yang t_df05b9'), 
    namaI)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tempat kota kelahiran. Jika lahir di _5600e3'), 
    tmpt_lhrI)

WebUI.setText(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Tanggal Lahir Ayah_tgl_lahir_ayah'), 
    tgl_lahirI)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/select_PendidikanSMAS1S2S3lainnya_1'), 
    pendI, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/select_Pilih AgamaKristenKatolikIslamHinduB_b43882_1_2'), 
    agamaI, true)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Pekerjaan atau usaha yang dilakukan I_6a85b1'), 
    kerjaI)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Jumlah rata-rata penghasilan perbulan_c542eb'), 
    gajiI)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nomor HP Ibu dari calon peserta didik_808a85'), 
    telpI)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/textarea_Alamat Orang Tua_alamat_ortu'), 
    alamatO)

WebUI.setText(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Nomor telepon rumah yang aktif dan da_1eb0f7'), 
    telpO)

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/i_Back_zmdi zmdi-arrow-right'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input__file_ijazah_sd'), ijazah)

WebUI.uploadFile(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input__file_foto'), foto)

WebUI.uploadFile(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input__file_akte_lahir'), akte)

WebUI.uploadFile(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input__file_kk'), kk)

WebUI.uploadFile(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input__file_rapor_smp'), rapor)

WebUI.uploadFile(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input__file_sertif_prestasi'), sertif)

WebUI.uploadFile(findTestObject('Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input__file_ttd_pendaftaran'), ttd)

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Persetujuan_persetujuan'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/input_Persetujuan_info_program_kerjasama'))

WebUI.click(findTestObject('Object Repository/Page_Registrasi Siswa Baru SMA Bopkri 1 Yogyakarta/a_submit'))

halaman_tujuan = WebUI.getUrl()

WebUI.verifyMatch(halaman_tujuan, 'https://ti.ukdw.ac.id/~anton/sibaru/registrasi', false)

