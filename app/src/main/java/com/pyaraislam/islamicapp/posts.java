package com.pyaraislam.islamicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import java.util.ArrayList;
import java.util.List;

public class posts extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;
    private List<String> imageUrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        imageUrls = new ArrayList<>();
        imageAdapter = new ImageAdapter(imageUrls);
        recyclerView.setAdapter(imageAdapter);

        // Replace these URLs with actual image URLs
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F0167b0d23f583badc77e833217289367.jpg?alt=media&token=449aafd5-925c-4e7a-afca-e64243ece1e1");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F01c57eee6156cd681165e983b66b93f4.jpg?alt=media&token=21d8ef54-5dbb-4327-a3ab-ef9fb9d5788d");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F0e23571a225f3943d9b54ecf1aa032a9.jpg?alt=media&token=15f41112-c8cf-4f5f-b028-33daee56fb77");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F0e731f84a1480d8908a593abbf03658c.jpg?alt=media&token=fd9a4589-9944-4616-bd3b-59ecee953542");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F1256d902e29c219be67da7f73fdfa167.jpg?alt=media&token=1f3543af-39df-412d-9f96-253d103e313f");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F1a3a87e13dd9904ae18c8d8b70a6fc46.jpg?alt=media&token=94a7613b-0b17-4869-bab7-b2a5c8ae2346");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F1e5016ccffeb6848a9b539641ef0e754.jpg?alt=media&token=b19a0f47-e596-4206-bf94-65fc6cd25066");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F1e9fa68afc8667d7d1afbf9b40bcc988.jpg?alt=media&token=ddb04005-87e6-4569-a693-b948fe1bfc65");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F1eef416f6cfb619f0f54b41f5e0706e0.jpg?alt=media&token=cd772ed7-40ba-41ad-984b-8bb93ab31826");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F1fe4a10d416021535e0967529b8629e2.jpg?alt=media&token=d3955237-2998-4db7-8419-ca9a3dc4b781");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F27428cf8f9d57a6a235a8a5a89a47854.jpg?alt=media&token=2ff9137f-c1bc-449a-a62e-9ed150c65525");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F2936a943d795126098c60d308420f018.jpg?alt=media&token=b3db6fd8-cb78-4b60-9eff-99b03a196c9d");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F2f171b5f9fda8be6ee3c76f04443fea4.jpg?alt=media&token=042d77f2-a4aa-4787-92ee-cdbcd9d8eae1");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F3341ae4e905d291e174a3341789537fb.jpg?alt=media&token=06f98695-fcf1-42cf-9593-9dc81afd66c3");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F354a04a5f50c0ac50bddb37c70cd149f.jpg?alt=media&token=abefc3c2-63d3-415d-9534-3122308dca3f");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F357f14a209b7fdcbc7d3dab70615c812.jpg?alt=media&token=ba96a572-6b71-4f5c-a54f-d8cd5c720c6d");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F37ea093ce8be8c6c923eee82df9581e9.jpg?alt=media&token=acbb3c76-3e62-4206-bf2c-02cdedc34802");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F3a693cb282360fc8dd521a2aa9129754.jpg?alt=media&token=236bf196-40c5-44d0-b7ff-63ba13083737");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F3c9d755b5f5b803e6187c8057a91a7b0.jpg?alt=media&token=a47280d4-fe5f-4003-a041-dce09cb0dd07");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F4040a77d99cbc7407f3e08268442f09d.jpg?alt=media&token=2e20cfce-9f23-4a6a-817f-4b5b13d230de");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F4551eb823935b8637c81b1db6177a5cd.jpg?alt=media&token=d808000e-02b9-4941-a8a9-0669fcc5fe6a");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F48ab05c31f9dd6090488d03ad5f11b82.jpg?alt=media&token=e3d93e56-d33d-47da-b4cb-3d61d89d37a1");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F49c7ca6ff9ac80099e132f9c79a93f8d.jpg?alt=media&token=38f9f72d-4cf9-4486-a036-958e0504b765");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F50dd62193f30999c6d8953117b529aca%20(1).jpg?alt=media&token=ee799e4e-231f-4e8a-a141-41ac88c09151");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F50dd62193f30999c6d8953117b529aca.jpg?alt=media&token=04365af3-5382-4bae-be42-90f13f53fb65");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F51a0631e278aff972ecf98724790a9e1.jpg?alt=media&token=34dc9767-ce2a-48c6-8d04-091c89a87ccb");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F528bb0d592ea3ef1b7ffee7b54849fad.jpg?alt=media&token=530475ad-b8cd-48c1-ab06-ed6e0111d428");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F52a87edd6727696982f2fc80e9bad076.jpg?alt=media&token=080c0471-2cd5-4c2b-813b-164873f2f078");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F542c809bfd639bfae3b3f8192b6eb4ed.jpg?alt=media&token=043a0af6-6c6a-48de-8eac-93fd7c28bbaa");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F60a4903754a6145edfc27b9e19dfd3ab.jpg?alt=media&token=28197d7d-fda6-461c-801b-c3d39942c116");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F63fadfd8bf98f0ae73998966659d67cf.jpg?alt=media&token=f576a788-366f-400c-9406-7f427af070f0");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F63fca46962b90e5b2b7f17200d9386ef.jpg?alt=media&token=1d12dd3c-4771-4bb9-88df-16dc2fc164a5");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F664bcc54c7de5873629ed9c61bfa7e71.jpg?alt=media&token=2607d2c3-f313-4e53-8829-27a64707ee05");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F66b289860a8d0515ef6a77e0b9672987.jpg?alt=media&token=3dc0554d-6140-4a8a-a77f-16b356018c60");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F70e575421d3f6dda38e7cea10e84b333.jpg?alt=media&token=26e5875f-3574-40da-aa51-dcd99998b0d9");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F7226eb9baf5d008526f2e66b2568d811.jpg?alt=media&token=3e1faaf7-7c0e-4dab-b8e0-b075e49a596b");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F7495903f0784d7c404bc32be264d7377.jpg?alt=media&token=b61abec7-2a51-4bdc-9a4b-c7fbc34306b8");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F7d157e4d87cdd5588fc8ef9b6fa14e68.jpg?alt=media&token=a52d93e9-a5d8-4670-8166-6f3c53461c47");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F7d89acabeaf7abe0e083857467301d24.jpg?alt=media&token=69c44782-44fa-418c-a9a6-ccc054bf9347");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F7edb8eb7a31c2e1b46c5a5b1d02c94f2.jpg?alt=media&token=d834af2a-a1a1-4955-91d6-80f7ad76122e");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F805a415e6c68dea4124a689461e1a717.jpg?alt=media&token=5a4bb279-845f-469f-9e99-4005159b1e19");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F82be97b2268634b154558d83889ca68b.jpg?alt=media&token=f2c23b1a-5fbe-445c-a526-86d228b08d60");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F831ffaeeff4afac223d92320c59d25cf.jpg?alt=media&token=da6a4a83-6c3c-4113-96f5-ac34cab02f47");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F85b3d993e8b0d09149e05cb7c76b532c.jpg?alt=media&token=a0e2e646-e1f4-43fd-a7b7-1ea8c4cdf01f");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F863cf814f7aa72d74ca861acbf8e5e99%20(1).jpg?alt=media&token=5004822f-b53c-465d-bd2d-c7e7f50ef898");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F863cf814f7aa72d74ca861acbf8e5e99.jpg?alt=media&token=0a483601-c195-44ae-9560-e75e6b06223a");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F86600c4d384ea95be473eda8a37289f8.jpg?alt=media&token=cc408041-6730-4de5-8922-36ba65fa73a9");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F9081477eac1415f625436b724bb6a844.jpg?alt=media&token=c2aaff85-bf79-47d0-8a91-7bbb0f960291");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F92f4cf69ea4f6ed7fc856087943d0864.jpg?alt=media&token=4b2f18ac-550c-4ad2-ae64-341fe2d3568b");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F9334f5b0fdb6732f87178782ac676927.jpg?alt=media&token=62c94ac5-0eff-4388-b313-fc35b45663a4");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F9e4d4358d8277b4a16f20de4f4e3d219.jpg?alt=media&token=2b151b43-3d6b-413f-bba7-a7d49e685f22");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2F9eb0e5e896fca143bfb1d658f336f474.jpg?alt=media&token=c9ecf5cc-31b8-4b70-ae8e-f4c9c012b8da");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fa0a4bc549539d9fc356707629a204e28.jpg?alt=media&token=512f2cd7-00bc-427c-8d3f-38c8228151cc");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fa29ed6309ff595059d27b9712eafdd23.jpg?alt=media&token=16280755-7a1f-45da-822b-b5db5fd4932c");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fa4d11afeee31c1678a81bafb69f357b6.jpg?alt=media&token=46b3df95-7e39-4369-ba82-e88ea3d3e275");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fa75a6c1957d1f7ceeb57847e1d4921e0.jpg?alt=media&token=ffc1fa2e-e0e0-4daa-8055-977be92b9814");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fa7ace2e6fe642269836c71dab56d4d91.jpg?alt=media&token=d8b00162-e94f-4d50-93e2-271141c5f58a");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fa9b528b0fd20b9acdc3b6ade090c06a4.jpg?alt=media&token=e3f965d0-98bb-4bde-a8d8-8eeda23cd4a0");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Faac6d5844146db7fcd2e01766f27d8f1.jpg?alt=media&token=8f4f20f5-2cbb-4bfb-9f8c-9f739cf173ab");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fabd87f6264543ae4524216c93e79964c.jpg?alt=media&token=43e53556-743f-4ec8-beea-06cb64d566bf");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fac636dff506d9ee7981d192e2db979d2.jpg?alt=media&token=ed73dd0a-f313-4c06-8d33-fee4a77a954b");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fae623a9b0a5d45998ec1d02432ae38ef.jpg?alt=media&token=66770c09-7b0e-4d7c-bffa-254f201dd93f");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Faf84a75e75425f033ae9f3d914b45327.jpg?alt=media&token=12a7d09c-1f5a-4f17-8015-e9b665e6ba11");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb13f65124701369fa7c0d1efdfea541d%20(1).jpg?alt=media&token=45968a6c-ca0f-46ee-a1e1-cca9d7266171");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb13f65124701369fa7c0d1efdfea541d.jpg?alt=media&token=f22cfa7b-d563-473a-ac29-3a3b54d45be1");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb22556bbe00a2d61219e83e7114f2648%20(1).jpg?alt=media&token=1abb1b4b-ac84-4834-9652-e775100997b1");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb22556bbe00a2d61219e83e7114f2648.jpg?alt=media&token=939e7cc4-46a1-4060-9b8b-4baf3e25ac4d");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb47a4f444303f9e6a7011788e3047eeb.jpg?alt=media&token=b9d2a320-a918-403a-821e-83427f2ef442");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb57a04ddd83fc28c1eedfda80a87fff0%20(1).jpg?alt=media&token=86afe857-c7c2-4fdb-8a80-d17939a878fe");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb57a04ddd83fc28c1eedfda80a87fff0.jpg?alt=media&token=530f5028-0485-4bee-85c2-f98be15f51f3");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb6d3db7a68c8e5907ed64663a54030a4.jpg?alt=media&token=9ecb31b5-c37c-4f96-9c3c-9055ca94e2b8");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb7312285deebe54e7d643349f723d7cb.jpg?alt=media&token=a0179975-dac1-4768-87a6-45198161aa79");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb96ac0cc5d06054d57767b72d101f52a.jpg?alt=media&token=9b196136-931c-4ebb-a761-f89f761ca48e");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fb96ed02ceed44cf02b6f8d18f8045919.jpg?alt=media&token=2dbabf6e-d8be-46c8-a528-3403dcdce62c");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fba2166aeef1f7d074b033963f472d259.jpg?alt=media&token=56601a09-9177-4ff8-9250-07c26199197a");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fbd4d62a5d9abf42d0eb76471a93bcb11.jpg?alt=media&token=2f56ae3c-471e-47a6-bf28-80a28839ab0e");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fbeee415515f6111621201fdceb1a9b4c.jpg?alt=media&token=96c6bb84-f4a9-47f6-8a40-a02b892dff85");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fbf7aa4e9f8b352fdbcf747e2bdb23823.jpg?alt=media&token=ea713320-a542-4757-a2c5-53c4ca5fabba");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fc27b1f8e861e0ca0dfadb8509cc30bbe.jpg?alt=media&token=fb717bcb-5419-4902-8cb6-1509f22ebd2a");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fc66212a85484d88bd70cd0e8580e2b02.jpg?alt=media&token=756d627a-faf5-4918-acf6-7914736eff05");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fca780f0b9af6a0f29930a858af796bda.jpg?alt=media&token=443dfdeb-b81d-49ef-b1de-293eb6047082");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fcce2bf4751c21ee2d8ba2399ecde314e.jpg?alt=media&token=13060635-88c5-4b7e-b48d-f602f506c16f");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fcf0b5259603cb9702dcce598042efdfc.jpg?alt=media&token=ec0712ce-3bc8-464c-b121-042f44fb1cd1");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fd065222d66e6da3c7e69d9656dd370b6.jpg?alt=media&token=d159869a-703b-4462-9cf1-755e8100d233");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fd9dd632ba441b77d8998d2a27351e208.jpg?alt=media&token=94f39ba5-5f0f-44df-8e28-0d882b47e941");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fe1fdfa0db431bec2bc448a5e19c122f4.jpg?alt=media&token=01ff9eb9-eea5-4673-8dff-7b58670637a6");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fe34dbd6c3e6f44f1cd1815aa9ac581bc%20(1).jpg?alt=media&token=c04a2bb4-c5f1-498c-89b4-11f1d0da1283");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fe34dbd6c3e6f44f1cd1815aa9ac581bc.jpg?alt=media&token=5d524030-8094-4692-9bb4-0fd024ffd844");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fe73f423cc70333d038983a19a8a43674.jpg?alt=media&token=87a3f944-8fe0-4b10-b990-d30dcfe5abdb");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fe77fadbe3b12bb5c18f94987a53c20f8.jpg?alt=media&token=b1b8f017-adda-4337-ac5e-27bc33400e16");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fecfb9a7f2bcdde492aa44d6918acf7ed.jpg?alt=media&token=ebc78d0c-e3c6-4d5c-a669-e8eda77df56a");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fedbb65b954af90ef90219bb5d782552d.jpg?alt=media&token=d5244284-875d-49f7-8bbc-8b9aba29bb11");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Fee98c363a73b94f85cd8a645f0fba97a.jpg?alt=media&token=8ee317c0-0f56-41e9-a563-615385479298");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Ff026216a9c41e48f3ae443b981f04540.jpg?alt=media&token=836219c4-9a48-495c-80bf-660cc02c8d72");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Ff184bd6677cf4bb69f2e0012baca09e2.jpg?alt=media&token=aedd3d2e-33c5-4386-9be6-6d2c295311a2");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Ff57459e99739dfb059c1c9d564a9fae3.jpg?alt=media&token=c91a4b59-e415-4d37-a4a2-a10797fd6fbc");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Ff8b811fc84484c7b27a15fa854298587.jpg?alt=media&token=e329237a-c2ea-44f0-bc50-e4e9f7d45100");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Ff9fe8c9c3fe8a93e1d54e5d83020c54e.jpg?alt=media&token=b2fff565-3fef-4c7a-8ec0-78b6bf649e5e");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Ffc13be8fe5b05dd3f1f6b99b23a90d7e.jpg?alt=media&token=1135c5e4-ceb0-4d79-9f0d-f66ed06724d5");
                imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/Posts%2Ffd195886af53e687056f3d40cfa3ef0e.jpg?alt=media&token=367738f2-5be7-493c-84cb-ac5207faf746");

        imageAdapter.notifyDataSetChanged();
    }
}