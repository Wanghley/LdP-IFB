img=imread('cameraman.tif');
[Gx,Gy]=imgradientxy(img,'sobel');
%Uncomment the code below to visualize Gx and Gy 
imshowpair(Gx,Gy,'montage')

%Uncomment the code below to visualize Gmag and Gdir 
[Gmag,Gdir]=imgradient(img)
imshowpair(Gmag,Gdir,'montage')