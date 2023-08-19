package com.pyaraislam.islamicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import java.util.ArrayList;
import java.util.List;

public class Wallpaper extends AppCompatActivity {
    private RecyclerView recyclerView;
    private WallpaperAdapter adapter;



    private String[] imageUrls = {
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F06b0ecdc943edca001987eb5f2a9b7d1.jpg?alt=media&token=d7bbf38c-3132-4218-8ee8-f6a59ae3a830",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F07a6bdfcc042803e70f86bd7c8459488.jpg?alt=media&token=a9645490-32cd-49ac-b70e-b31596774515",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F08937eef7591070658bf031467b2adf7.jpg?alt=media&token=9acc446e-0501-4a22-845b-43e21a43cdfc",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F10a307632730efc4520489008e803194.jpg?alt=media&token=4e5ac16e-cc59-483b-a44e-c8b5722907ae",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F14d4cbd0b6f2c7393250003f0ee652dd.jpg?alt=media&token=a19509bc-c9af-4638-8b3f-84320a285333",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F1b135d93101968ecb9fd45f50227d038.jpg?alt=media&token=bb34d597-b0b5-4919-bfcf-47e7220e67bc",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F1dc9b736433e58073d28152aa54a19b2.jpg?alt=media&token=9ee25120-f9c2-4ebe-a113-0d296d8dda1f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F20515303.jpg?alt=media&token=52bf496b-6764-451b-92be-ab478db9d72e",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F20515407.jpg?alt=media&token=061c164d-4a24-4233-9ff3-8cd495e50c55",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F2132c186ee9338ddfabd60eb95ddc62c.jpg?alt=media&token=5e775b18-a97e-44df-869b-1754621925fd",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F22d5ac47dad28c7dd5fe02a2cef1e771.jpg?alt=media&token=aa630987-bc89-47c7-aef6-6e06cb2f8782",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F23a10c9851f78cd11b0bba9f8cf7078e.jpg?alt=media&token=416d972c-63b0-4612-86fe-4a816f685e21",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F25e2763d320acaa9baf4b7622cd2233a.jpg?alt=media&token=579688da-831a-41a7-8460-85a54dc0e3c8",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F26e90564b7e45c310af61a308c7803cb.jpg?alt=media&token=f0e876bb-8743-4964-a52e-f4fb13de26c1",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F2813734e2f9a63b7f67069ebd288d1b6.jpg?alt=media&token=a8cb9765-5a1d-4a14-b3be-8f7123581a6f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F291c0c1b2a037997a0d422272c86b977.jpg?alt=media&token=bab104b5-8a7a-49ce-93c9-4ecd8d64f127",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F31a07d5a68ec3db494e4c79a22d31b84%20(1).jpg?alt=media&token=17fe9e97-fb8b-4462-a0d4-5040be97c9b3",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F3391a3325498f204ca959508c76aeb75.jpg?alt=media&token=72331068-adbe-4cd2-9240-d68543422021",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F349fcbbc91d68a227d2a0923ea3480e2.jpg?alt=media&token=f9afa2cb-2327-4fc9-816b-99924782c4e5",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F3a9647672170010b3744fe0b9332efd2.jpg?alt=media&token=8c039c16-aef2-44a0-9479-9919e394e5ee",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F3ac733f9c443916ddefa5b90f1ea60b9.jpg?alt=media&token=41a7c87b-3483-4bcc-80f3-bfbe14ca85ea",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F41843c687a939c666d80ecb09ac13989.jpg?alt=media&token=e1fd0918-ab35-46ca-a5c1-edc33b305aa6",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F4641c7f13c9548ea324eb1a76d3f32c3.jpg?alt=media&token=ffe7c839-1f52-4f94-81cb-e67812c07a20",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F48353bff49542c99fede73db9a17103f.jpg?alt=media&token=20f3df87-d144-44f5-83a4-a1be09ee0957",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F48b05f1363fa32fbbb985423eeb706d9.jpg?alt=media&token=605469c9-a086-4a31-9bdb-29c721c14053",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F4ab61c3e1a9c9ea591e0e72bcf8094f6.jpg?alt=media&token=d0d83d39-bb07-4334-9c1b-ad4063c2d291",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F4ae9c71e0a998f073b6d0d20bee12f3f.jpg?alt=media&token=063f4732-cabb-4b17-adfd-2d3e8014b68b",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F4afcfa9356e4645953f4598a8221173d.jpg?alt=media&token=f5e479f2-8eab-4d13-8303-c87acf52ebe5",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F4b2199b490d302b80a135f6397de6213.jpg?alt=media&token=f7ad6acd-e9e8-4ba0-9538-0b63515be44d",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F4eed7cb4c563a234d4946452a3a6b5a3.jpg?alt=media&token=2319c502-e950-42c8-9fda-74cbcd561207",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F53f84a0495f0d015f86b5fa59ab135f5.jpg?alt=media&token=7feb3621-02c5-411d-834e-bf12dc1b82b0",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F556fa5f8aa7b0cafa36c245114f82706.jpg?alt=media&token=b587acb0-6096-440a-acf4-2e82382a08cf",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F584a9e429e5d97c5f1f6a8005ccca326.jpg?alt=media&token=170c6b96-d0eb-4fe6-9767-040df0ffa306",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F5dafad55d7cdfb17323d70c2b6f04f3a.jpg?alt=media&token=dc9d28a2-71c4-4788-99c9-e25c7728e3ae",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F647cb9800ee050517717cfd604c9d463.jpg?alt=media&token=7105b3fd-1810-4153-b99e-9e4acb0a9098",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F67c4bd0ff9c9f2c2347b8c14b96634b2.jpg?alt=media&token=d56ebef7-78b3-4561-962f-ad320b9c99ad",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F68503eddb9b98e8efe30a2bcbcef8683.jpg?alt=media&token=792ce7b0-8542-42db-8722-38ac72346205",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F7331d9d4537d8327163f1a59b92f36ff.jpg?alt=media&token=aca92fbe-aa25-4f90-8222-f7add4b19bc7",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F762f2685e4cc55f060b62452caa056bd.jpg?alt=media&token=7a4598e2-09a2-4505-bcdf-baa51ac3ad80",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F7c295fd52740f21960d755f3e2189bf6.jpg?alt=media&token=fe911def-5a5c-4096-9a78-da9bf027d2ce",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F853f7d2410ad37b273cb7443f673fc40.jpg?alt=media&token=ece532b9-970e-47b8-8785-ed5aba8dc796",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F87bb352a0624fec9ce7f82afa375f31e.jpg?alt=media&token=b0be2724-0200-4cb9-81c7-547e12e9414e",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F8b19c5d308101feda1b305c6c8ed072d.jpg?alt=media&token=e589846e-4360-4655-b091-cb9f29355527",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F8b99786a12ba7f64a44c3c903a4a5362.jpg?alt=media&token=36741839-1740-40ac-8aed-041e0c6604bf",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F988fb4a6ad21888e9d58c2884c7cb066.jpg?alt=media&token=01cf5227-a17b-4152-af61-5d17297e626f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F9a66b0fec32a5cd625da06d79d95dc74.jpg?alt=media&token=a548744b-1576-4e2c-8896-21f3ce6aa0f2",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F9d47e63ae941a8db2748694aa8c84e18.jpg?alt=media&token=0ceb66ab-d91e-454e-9209-a455d06c024b",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fa33d528f3c928f67ed975a728c9e1ebf.jpg?alt=media&token=95dc6839-e51e-4388-80d4-7a89ecf8d5e1",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fa8d0208657f3457c0078d2546a40896b.jpg?alt=media&token=ea375dea-0867-4f76-bb19-0b7710cd99a9",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fa9ec0be7545f5b34188473f413333cd9.jpg?alt=media&token=c1077343-048a-4e89-b59b-3312b6eb670e",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Faa8f44cc484d38fa053f56be583da336.jpg?alt=media&token=9c6f7318-cd0b-4261-b947-a031af5cd876",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Faafe102201b51957a51e775c4417d0ff.jpg?alt=media&token=54ea698c-fbae-4514-9224-a71576249831",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fae1562976ac5d6c99739e2a467bcf096.jpg?alt=media&token=a7900066-b9d6-4087-94ad-b3acb54190db",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fb0d8c6700fe38758079a4bd06ea97f35.jpg?alt=media&token=783e432f-dccd-42db-bdac-ba5ed9605e56",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fb6606fb8ef890b45d09faf19d82b832b.jpg?alt=media&token=0689c919-3de0-4466-a4fc-e948eee42115",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fwallpaper2you_323418.jpg?alt=media&token=e774ec92-eefa-4d97-899f-e3d54eba6abf",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fimages.jpg?alt=media&token=7b4da47e-556c-4065-9ea9-252434b57206",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fimages%20(5).jpg?alt=media&token=b956515c-9ba3-4bdf-91b2-0add3388c684",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fimages%20(4).jpg?alt=media&token=36832f5c-8103-479e-9fd5-6f3c734f9f0a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fimages%20(3).jpg?alt=media&token=6fb52fdd-1216-4310-ac42-fcf799c9bd20",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fimages%20(2).jpg?alt=media&token=8ad295aa-e1c8-4f7a-b9b1-568b37eefca5",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fimages%20(1).jpg?alt=media&token=4d92505d-d82e-4a1a-95c1-de08b2e7554c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Ffd3e611776e6f393b1609e298835cdb7.jpg?alt=media&token=60e9dde7-a01f-4088-8891-f29ba3f4085f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Ff9c1a79f3b12f32ee61040b80adac5c7.jpg?alt=media&token=43e1f6bc-4cc6-447f-aa25-3c724c9c3d7a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Ff34997513dc630562432222e866e2be7.jpg?alt=media&token=f642592f-0ba0-4960-807f-6518a721fab8",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Ff24fd963c1127b2459e8a4da47d9e922.jpg?alt=media&token=2d1da6f3-6afb-495c-9817-112d75c98d09",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Ff0392016b210ca4b94fcae84006f4738.jpg?alt=media&token=baaebf9a-a94b-4b6d-b257-5ab7d3100862",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fed77df38e612a15f82c68137d7da2366.jpg?alt=media&token=cf604151-6474-4a6a-90f4-79ccda727381",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fed77a7ba0ff2ef93553280ce938b4943.jpg?alt=media&token=21686cf6-6523-4b2e-8b51-96bbac4422bc",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Febffdbe956e966e63b72b20d45642abf.jpg?alt=media&token=539394d9-d0f8-48b2-8734-1e850e5c0034",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fea5ff62b5949777e2ced6b5aae80e884.jpg?alt=media&token=be345761-91a8-4e54-be99-f6431bbf5053",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe98a9f22bea85f251bc17073f8ac1b12.jpg?alt=media&token=21efc7e9-a146-4b2a-94da-5c83eb0e2920",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe8f86444e9ee0af83b97888a7d19c353.jpg?alt=media&token=4468d8b7-c3b2-4f3f-b56d-92a835162298",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe70e7f855af342bb7f39b14f62a64037.jpg?alt=media&token=c638f0b0-0f08-4eda-85d8-afede8644ffd",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe4753d93c12a18467d7f252cc2d1bb48.jpg?alt=media&token=1e641a5f-f40f-4e6e-a81d-097f21f2460f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe389aeeea074b433a720e93c19478221.jpg?alt=media&token=cd8ffddc-7509-4100-85d2-c017b1930b6b",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe2b50be515bf73219bb8ea1177c268a1.jpg?alt=media&token=449bb59a-d0c6-483a-9487-31961d9ec964",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe1e15e8d50fd0ab9b64bf66ac0a648e6.jpg?alt=media&token=bbe214ee-3402-4cc2-92ac-00dbe1f0b077",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fe0da190d3aafd9b19ca051cda9cf9845.jpg?alt=media&token=ee839c65-127f-406b-8fe1-55b57696cddf",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdownload.jpg?alt=media&token=0250668c-a90b-484f-9e49-656bee79198a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdownload%20(2).jpg?alt=media&token=a1e8f888-f535-4225-a1ab-d7642ba80e1a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdownload%20(1).jpg?alt=media&token=688e02cf-a5c4-4436-9d26-88d6be5c395e",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-subhanallah-islamic-and-other-beautiful-high-quality-islamic-on-islam-we-have%E2%80%A6-iphone-islamic-thumbnail.jpg?alt=media&token=f812cd52-5335-4759-9d36-677e5c66ca91",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-islam-mosque.jpg?alt=media&token=7ca99111-ae5b-40b1-ac85-60e00348ca33",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-islam-jumma-black-allah-thumbnail.jpg?alt=media&token=f81da308-092c-468c-8262-e4bdb5ef1584",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-iphone-thumbnail.jpg?alt=media&token=1672e3aa-4fc8-40e0-b1c2-5a9888bc1985",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-iphone-islam.jpg?alt=media&token=67450774-c522-4ba0-aa10-3a7f2377f2b9",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-allah-gold-dua-art-islam-islamic-prayer-thumbnail.jpg?alt=media&token=68ee98e0-bc1e-45fe-96ff-c760c7d40929",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdd72d1228da057e65d053cde336a85ab.jpg?alt=media&token=5d82663f-8711-4ae5-90da-993ab73a0a3d",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdcd5685be2c79fc0a89e3394edba5d3f.jpg?alt=media&token=f1e364b1-5ca6-4eb7-8ccd-dca8e10dc4d4",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fda071673c1422cd83d8a7083cc6499e9.jpg?alt=media&token=f2ba4d01-ef62-41be-90a2-b467d20b535c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fb70fe972a295a23f697c32e47b390ec8.jpg?alt=media&token=20ba85fa-e8bc-49c3-8e25-d057b977b1bc",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fb9a28faa6d9a2ee480cabed0ced8610b.jpg?alt=media&token=82fff8f2-2015-415b-aa70-faff0215c00c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fbe2d65f034af4ece15781f56e53a02b7.jpg?alt=media&token=da825c30-469a-43ea-8f4a-d1471aeff298",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fc7ba7d31e1e146ed7b092ab6b03681cb.jpg?alt=media&token=311e9043-2a45-4a7b-9053-1e79189a1afa",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fd9a4d95a61db2461ed48d5a331997d5f.jpg?alt=media&token=4b9169d6-8303-4021-afc7-4b67723e8f9b",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fd54bcd14cfdb462ee9b115c9ec989ffa.jpg?alt=media&token=76e3274d-d065-40c3-8ff1-7c68fffc50f8",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fd3f9c903c317f81fff1bdad5e5d12339.jpg?alt=media&token=409381a9-a4ed-4578-a8a0-fe2816ba3ded",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fd3d89c39d33a18ba2e4e118b0c2d8243.jpg?alt=media&token=7b248cb7-31d5-4a85-b510-1a5300bd8544",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fcf4ea169c5f915eb980b4112423a7a2a.jpg?alt=media&token=8ead0bf7-6751-4ae7-96cc-23c05b0fad3a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fced27b89109e731d580ee38532d8757c.jpg?alt=media&token=66c07b67-a621-4009-88ce-26ee8b025c00",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fcd4f107ab341cc919fe5b59c787af54b.jpg?alt=media&token=395cdb46-dc84-4cce-a8ad-97dae8191aaf",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fcbe5f20147c61e09e58d4204283429e1.jpg?alt=media&token=717b75ec-05eb-4aa5-acdf-5b81a7a99157"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // GridLayoutManager with 2 columns

        List<Wallpaper_items> wallpapers = new ArrayList<>();
        for (String imageUrl : imageUrls) {
            wallpapers.add(new Wallpaper_items(imageUrl));
        }

        adapter = new WallpaperAdapter(wallpapers);
        recyclerView.setAdapter(adapter);
    }
}