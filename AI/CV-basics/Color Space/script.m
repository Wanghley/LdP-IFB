rgb=imread('seastar-on-beach.jpg');
subplot(2,2,1)
imshow(rgb)

a = zeros(size(rgb, 1), size(rgb, 2));

%complement img%

c = imcomplement(rgb);
subplot(2,2,2);
imshow(c);

%red component%

r=rgb(:,:,1);
rColorized=cat(3,r,a,a);
subplot(2,2,3)
imshow(rColorized);

g=rgb(:,:,2);
b=rgb(:,:,3);

blackImage = zeros(size(r), 'uint8');
rgImg = cat(3,r,blackImage,b);
subplot(2,2,4)
imshow(rgImg)
