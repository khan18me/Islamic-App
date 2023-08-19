package com.pyaraislam.islamicapp.reels;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

public class reels extends AppCompatActivity {

    private RecyclerView recyclerView;

    private String[] videoUrls = {
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F005c9c210557858b2fe6068dcb07bcf0.mp4?alt=media&token=6bf285f0-96ae-4898-834b-a37dc298e65a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F03a59f9447e398f41562f5732950d34e.mp4?alt=media&token=9d57546a-60dd-4439-be4d-4fa0bd411db9",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F06d62bda2a907d04fdea702f9189101b.mp4?alt=media&token=2f1e58ad-9d70-4762-bf82-952efc01c6c2",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F06f22634b185032f9d8f0455ba868c99.mp4?alt=media&token=f7463034-34ca-44d3-83a7-2bb0f6b8c376",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F08e16b63370ad3732c859f3bad6b5c8e.mp4?alt=media&token=55d9f819-a25c-4ebc-97dc-a62de6a2e7fc",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F0c47df63d0f82d200261380b6429e063.mp4?alt=media&token=e684f663-1605-46a7-ba44-9a7592721fc1",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F10458e7c21517cea3a96ad85a004329d.mp4?alt=media&token=3b5980ba-523f-406c-a3f3-a93ca3d8fad0",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F114581cd453aace80593c5f56eee3354.mp4?alt=media&token=cbea3655-c0b7-4582-b11c-54370fe1aa80",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F19367b208215cc1ac0ce7da8e16533a3.mp4?alt=media&token=83dbbc9f-6208-400d-ae8f-8f2258e06638",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F2d9501b315bb9c70160759ce1ba664d5.mp4?alt=media&token=582e82f5-1b4f-4a5c-bdef-a2e584fba41a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F37650aca59ad9a65fdc69bd4efff8e69.mp4?alt=media&token=ff3a8c34-0461-454f-8cb5-f89880915052",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F37880cdc9dfcff65e7f7a6a1fe809030.mp4?alt=media&token=e844e26a-e379-4cda-81a0-31989dab0612",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F572693f247c737d377640d89255ac75c.mp4?alt=media&token=c1d380c2-c2db-42c0-b89b-75915db65e6c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F592d5a98d8c6465d5b4d34319f2bbbda.mp4?alt=media&token=bf05d7ae-2da0-4824-9cf2-207a78488082",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F5bc11cb21ceb2dcc4050b803c7faa9a7.mp4?alt=media&token=f4af0477-56ff-4f7d-bed4-2bb77a483418",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F5cfcae85b424e6820439cdcd1469e766.mp4?alt=media&token=2e21945a-597c-48cb-8cf8-2378676b2465",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F612a80f55a68b4e4aa0661efe26603b1.mp4?alt=media&token=014bdc2a-d5ef-4462-be95-94d1fa847e50",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F614d5552a2a1be1c0c54f7e42184d1d2.mp4?alt=media&token=460926c3-9c4e-46ba-94ec-80ca4c1cea7c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F6227f9cdce21cbf24592e3572c0a970c.mp4?alt=media&token=57292938-1117-47c2-8ab0-d4ca28d5b468",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F69e69bb329ef336b507e894fc7503e97.mp4?alt=media&token=4706569c-4d6a-4a91-ab7c-f2ea2d4b43e0",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F708dc7c91edf91487317d1165571cffd.mp4?alt=media&token=d398e93c-4380-4af1-b035-afebda66fa6d",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F7299cbf2e70696de36c72ba66ea80d56.mp4?alt=media&token=860d988a-f9e0-4b68-a988-db8a3e43a55f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F80195aca78501ac8071dee67497eb989.mp4?alt=media&token=40632d49-1e9e-4b73-a7a4-ac54a7064a4a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F8133127235874acd0f93ea7dc53e8e34.mp4?alt=media&token=43f255a4-4e4a-4a0a-96c2-f880c7c0022e",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F83a02ac0e7fc9065c0b8aa7426317a89.mp4?alt=media&token=2e1352f7-f938-4727-9d07-df26152b7ff8",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F8519b7267fa25ee2a34b416a8334d995.mp4?alt=media&token=1ea567ef-9579-4e02-899a-60a71e2abf64",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F89819f176859c6ec875daece312fcff5.mp4?alt=media&token=a1022931-0c46-44c1-8176-6eba698133ae",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F8d84406586b576ee4944445e1381f6b1.mp4?alt=media&token=fe052bb8-2ad4-48f7-8f75-b546169a37ec",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F94e3b01fcb5447c6908294d5b8baed33.mp4?alt=media&token=04733e17-2b25-4313-a440-476d8b04e73b",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2F9c97224ebf92191591146bd9a135e7b4.mp4?alt=media&token=d5477a5d-21a9-40b0-85b6-d75a00f9c1fe",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fa60f3d4e718e6b209eff4656181a1678.mp4?alt=media&token=ec0a38e4-ce84-4618-a4fd-fa176031ed8d",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fa7077dd3cd74faee8104df3e8deb0b55.mp4?alt=media&token=919af7b9-984e-41e5-81ab-672b7f8e491f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fa7e6dc895a9a70d326ee11011cc506e1.mp4?alt=media&token=089baca5-48fb-4b15-8717-92a16c8ec83b",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fab0069315d195abb4e166bfe9ac0f06e.mp4?alt=media&token=60f1cec3-0fe6-44c7-93f8-bf267118ff3a",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fabfbf916190620261745251bef84d142%20(1).mp4?alt=media&token=1efbcc43-80be-476f-a84b-f842647cba85",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fabfbf916190620261745251bef84d142.mp4?alt=media&token=d3172bd8-04b9-4502-a570-bd421bc72d3b",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fb1281c11c3ca4148acae281fbb4a1a4b.mp4?alt=media&token=07c491dd-0890-44e8-8971-cd58efb71926",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fc4864b2d19ab3ff453bb14375e715205.mp4?alt=media&token=0f55a19a-18fe-4d11-94c2-b04bdf1ba2d3",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fceec540e90e167068dda00f04c6e2c4b.mp4?alt=media&token=a8bf8bd0-1171-40ee-b9cc-d77baa52b2ed",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fd60389b408aad25b0fe8bbb0ed3efb63.mp4?alt=media&token=9c962905-f90d-4d1b-a044-956c4d39162c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fd900b76830f370b53e8f6b5a82911a85.mp4?alt=media&token=baa97f12-f588-4d40-b7ea-d1da1a8ab7a7",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fdd5cf45ad53ecf26417fd8b3a7d0942b.mp4?alt=media&token=d6cac03d-6a54-4471-ae14-4b15ab879c0c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fe90713d9ed75dcb3f086b6e91755268a.mp4?alt=media&token=cfca3842-1f3d-4883-b62d-38fabb4db2d9",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Fee50283afdb1c15c76cbee7f17834d49.mp4?alt=media&token=bc361a72-7cf1-4ba3-aef5-eb4a9130c402",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Ff253641013289e92038b1d8e449fea33.mp4?alt=media&token=23d8cb6e-6939-4d0a-a28a-ca9a5a92fcd6",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Ff7738aabdc851d282ab02e214059b351.mp4?alt=media&token=1d156dde-67a2-4aa4-a0b3-cbb0c9cf73b5",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Ff87d2c1f287bdb36e82ec12b613c193e.mp4?alt=media&token=34df0dfc-53b7-4401-aed7-46b88930536c",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2Ffc85dc5881d378d61cd3c49a9e9635fe.mp4?alt=media&token=fcd2bf7e-7292-4187-8907-dc914345ab4b"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reels);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new VideoAdapter(videoUrls));
    }
}

 /*videoUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5");
         videoUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5");
         // ... add all 20 URLs here
         videoUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5"); */
