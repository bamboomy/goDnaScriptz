package genetic;
import java.util.ArrayList;
class Thought162 extends Thought{
private static ArrayList<Thought162> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 990.5700605005984;
private double fd1 = 554.1116289875206;
private Thought fo0 = null;
private Thought fo1 = null;
Thought162 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought162 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought162 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought162 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought162 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought162 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought162 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought162 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought162 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought162 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought162 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought162 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought162 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought162 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought162 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought162 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought162 instance = new Thought162 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
    Thought lo1 = Thought201.getInstance(fo0, fo1, fo0, fo1);
    Thought lo2 = Thought207.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb0;
    Output.points[3][5] -= fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Output.points[3][6] -= fd0;
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld0 = 239.94852390979392;
    double ld1 = 959.2398544062585;
    double ld2 = 555.8759892284899;
    Output.points[3][7] -= ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 250.9912551108268;
    fb0 = ld2 < ld3;
    double ld4 = 85.4728185425282;
    Thought lo5 = Thought132.getInstance(ld4, fd0, fd1, ld0);
    for(int i0=0; i0<10; i0++){
        Thought lo6 = Thought47.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, ld3, ld4);
        fb1 = fd0 < fd1;
        ab1 = !ab2;
        ld0 = ld1 + ld2;
        ab3 = ld3 < ld4;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought177.getInstance(fo0, fo1, fo0, fo1);
    if (fb1) {
        fd1 = ad1 - ad2;
        for(int i0=0; i0<10; i0++){
            ad3 = ad4 - fd0;
            }
        boolean lb1 = false;
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
        lb1 = fd1 < ad1;
        boolean lb2 = false;
        Thought lo3 = Thought195.getInstance(ad2, ad3, ad4, fd0);
        for(int i1=0; i1<10; i1++){
            boolean lb4 = true;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
            Thought lo5 = Thought118.getInstance();
            ad4 = fd0 - fd1;
            lb1 = !lb2;
            fb0 = ad1 < ad2;
            fb1 = !lb4;
            lb1 = lb2 || fb0;
            Thought lo6 = Thought145.getInstance(fb1, lb4, lb1, lb2);
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 149.94686925357044;
    ld0 *= -1;
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ab2 = ld0 < ad1;
    ad2 *= -1;
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    boolean lb2 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 966.2660757987651;
    fb1 = !fb0;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Thought lo1 = Thought307.getInstance(ao3, ao4, fo0, fo1);
    ld0 = fd0 + fd1;
    fb1 = !fb0;
    if (fb1) {
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 16.339441618175613;
    Thought lo1 = Thought120.getInstance();
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb2);
}
    ld0 = ad1 + ad2;
    double ld3 = 345.8774103173532;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought317.getInstance(fd1, ld0, ld3, ad1, fb1, lb2, fb0, fb1);
    lb2 = ad2 < ad3;
    fb0 = fb1 || lb2;
    boolean lb5 = false;
    ad4 = fd0 + fd1;
    double ld6 = 100.32265789282;
    lb5 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, lb5, fb0);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld3 = ao3.m3(ld6, ad1, ad2, ad3);
}
    fb1 = !lb2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][8] -= fd0;
    Output.points[4][0] -= fd1;
    fd0 = fd1 - fd0;
    Output.points[4][1] += fd1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[4][2] += fd0;
    Output.points[4][3] -= fd1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
    double ld1 = 812.334985674737;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought355.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought93.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    double ld1 = 962.6856101928942;
    ad4 = fd0 - fd1;
    ld1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld2 = 497.2925178086149;
    fd0 *= -1;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 254.41311012071333;
    lb0 = fb0 || fb1;
    boolean lb2 = true;
        fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
    boolean lb3 = true;
    lb0 = fd0 < fd1;
    ld1 *= -1;
    Output.points[4][4] += fd0;
    boolean lb4 = true;
    Thought lo5 = Thought63.getInstance(fd1, ld1, fd0, fd1);
    Thought lo6 = Thought173.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, lb4, fb0);
}
    fb1 = !lb0;
        boolean lb7 = true;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought258.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
    ab4 = fd1 < fd0;
    fb0 = !fb1;
    lb0 = ab1 || ab2;
    double ld2 = 315.81526603675144;
    Output.points[4][5] -= fd0;
if(fo0 != null){
      fo0.m1(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld2 = fd0 + fd1;
    Thought lo3 = Thought46.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    lb1 = ad3 < ad4;
if(fo1 != null){
      fb0 = fo1.m2();
}
        fb1 = fd0 > fd1;
    Thought lo2 = Thought336.getInstance(lb0, lb1, fb0, fb1);
    lb0 = ad1 < ad2;
    Thought lo3 = Thought172.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2();
}
    double ld5 = 160.43169256621317;
    ad1 = ad2 - ad3;
    boolean lb6 = true;
    lb6 = ad4 > fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[4][6] -= ad1;
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ab3 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ab1 = ad4 < fd0;
    fd1 = ad1 + ad2;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[4][7] -= fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        boolean lb1 = false;
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb2 = false;
        fd0 *= -1;
        boolean lb3 = true;
        fd1 *= -1;
        fd0 *= -1;
if(ao2 != null){
          lb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        lb1 = lb2 || lb3;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Output.points[4][8] -= fd0;
        }
if(ao4 != null){
      ao4.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    ad2 *= -1;
        ad3 *= -1;
    fb1 = ad4 > fd0;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    double ld0 = 409.1255556698155;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < ld0;
        fb0 = fb1 && fb0;
if(ao1 != null){
          fb1 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought30.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
        Thought lo2 = Thought281.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
          ao4.m2(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m3();
}
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            double ld3 = 785.2670929753843;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld3, ld0, fb0, fb1, fb0, fb1);
}
            double ld4 = 639.773922116017;
}}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    double ld1 = 308.5532806393235;
    boolean lb2 = true;
    double ld3 = 911.7538916077502;
    ld3 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(ld1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought340.getInstance(ao3, ao4, fo0, fo1, lb0, lb2, ab1, ab2);
    ld1 = ld3 + fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(ao2 != null){
      ab3 = ao2.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    ab4 = fd1 > ad1;
    fb0 = fb1 && ab1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m2();
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m2(lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    if (ab3) {
        ab4 = ad1 > ad2;
        fb0 = !fb1;
        ad3 *= -1;
        boolean lb3 = true;
        lb3 = ad4 > fd0;
        lb0 = lb1 || lb2;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought264.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Output.points[5][0] += fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb1 = true;
        fd1 *= -1;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (ab2) {
        fd1 *= -1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[5][1] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        Output.points[5][2] += fd0;
        fd1 = fd0 - fd1;
        Thought lo0 = Thought160.getInstance(fd0, fd1, fd0, fd1);
        if (fb1) {
            Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 250.0957487497768;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ld0;
    ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 356.14546097581706;
        Output.points[5][3] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld1 = 88.15743984119267;
if(fo0 != null){
      ld0 = fo0.m3(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    double ld2 = 751.3592344468249;
    Output.points[5][4] -= ld2;
    lb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld2 *= -1;
    double ld3 = 969.4947463598909;
    ld3 *= -1;
    fb0 = fb1 && lb0;
if(ao1 != null){
      lb1 = ao1.m2(fd0, fd1, ld2, ld3);
}
    fd0 = fd1 - ld2;

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = !fb1;
    Output.points[5][5] += ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    Output.points[5][6] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    double ld1 = 379.7803932959905;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    double ld0 = 914.1091784646128;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + ld0;
    fd0 *= -1;
    Thought lo1 = Thought361.getInstance(fd1, ld0, fd0, fd1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    Thought lo2 = Thought168.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = fd0 + fd1;
        fb1 = ab1 && ab2;
    Output.points[5][7] += ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    lb3 = fd1 < ld0;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld0;
    boolean lb4 = true;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
    ab4 = fb0 || fb1;
    double ld0 = 299.0400642962048;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld0 = ad1 - ad2;
    if (ab2) {
        boolean lb1 = false;
        ab2 = !ab3;
        Thought lo2 = Thought124.getInstance(ab4, fb0, fb1, lb1);
        double ld3 = 524.6037864647553;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = ld3 - ld0;
        ad1 *= -1;
        Output.points[5][8] -= ad2;
        fb0 = ad3 > ad4;
        fb1 = lb1 && ab1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld3, ld0, ab2, ab3, ab4, fb0);
}
        fb1 = ad1 < ad2;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 673.9098083256636;
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 = fd1 + ld0;
    Thought lo3 = Thought341.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Thought lo5 = Thought271.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, lb2, lb4);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, lb6, fb0, fb1, lb1);
}
    ld0 *= -1;
    lb2 = lb4 || lb6;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    lb4 = lb6 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fb1 = !lb1;
    Thought lo7 = Thought188.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    double ld8 = 351.207897670627;
    double ld9 = 308.8727184832793;
    ld0 = ld8 + ld9;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
if(fo0 != null){
      ab3 = fo0.m2();
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo0 = Thought29.getInstance(ab4, fb0, fb1, ab1);
    ab2 = !ab3;
    ab4 = !fb0;
    Output.points[6][0] -= fd1;
    boolean lb1 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought172.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought255.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought167.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo3 = Thought271.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    boolean lb4 = true;
    fb0 = fb1 || lb4;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought104.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 256.71208901457766;
if(fo0 != null){
      ld1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    double ld2 = 227.6254968096569;
    double ld3 = 97.70281768376458;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[6][1] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld2, ld3, ad1, ab4, fb0, fb1, ab1);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    double ld2 = 593.9990017144098;
    lb0 = !lb1;
    double ld3 = 736.6731024571291;
    boolean lb4 = false;
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ld3, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ld3, fd0, fd1);
}
    ld2 = ld3 - fd0;
    fd1 = ld2 + ld3;
if(ao2 != null){
      ao2.m2();
}
    lb4 = lb5 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, lb4);
}
    fd0 *= -1;
    Output.points[6][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, ld3, fd0, fd1, lb5, fb0, fb1, lb0);
}
    Thought lo6 = Thought388.getInstance(ld2, ld3, fd0, fd1, lb1, lb4, lb5, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb1, lb4);
}
        lb5 = fb0 && fb1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
    Output.points[6][3] += ad1;
    for(int i0=0; i0<10; i0++){
        Output.points[6][4] -= ad2;
        boolean lb0 = true;
        fb0 = ad3 < ad4;
        fb1 = lb0 || fb0;
        fb1 = lb0 || fb0;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        fb1 = ad1 < ad2;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        Output.points[6][5] -= ad1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        lb0 = fb0 && fb1;
        lb0 = ad2 < ad3;
        Thought lo1 = Thought267.getInstance(fb0, fb1, lb0, fb0);
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        double ld2 = 786.5064448219889;
        ad4 = fd0 + fd1;
        ld2 = ad1 - ad2;
        lb0 = ad3 > ad4;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld2, ad1, fb1, lb0, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            boolean lb3 = false;
if(fo1 != null){
              ad2 = fo1.m3(ao1, ao2, ao3, ao4, lb3, lb0, fb0, fb1);
}
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    ab1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought184.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, lb0, ab1);
}
    if (ab2) {
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
          ao3.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m3(fd1, fd0, fd1, fd0);
}
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ad1 = ao1.m3();
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb0, lb1, ab1, ab2);
}
    double ld2 = 150.17714298404036;
    ab3 = ad2 > ad3;
    ab4 = ad4 < fd0;
if(ao4 != null){
      ao4.m1(fd1, ld2, ad1, ad2, fb0, fb1, lb0, lb1);
}
    boolean lb3 = false;
    Thought lo4 = Thought171.getInstance(fo0, fo1, ao1, ao2, lb3, ab1, ab2, ab3);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    double ld0 = 856.5033787510233;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[6][6] -= fd1;
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    Output.points[6][7] -= fd0;
    Thought lo2 = Thought336.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    fb0 = fb1 || lb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb1 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 823.337389182587;
        double ld1 = 543.2886355632892;
    ld0 = ld1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo2 = Thought287.getInstance(fb0, fb1, fb0, fb1);
    Output.points[6][8] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ld1 = fd0 - fd1;
    double ld3 = 556.5247819887701;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ld3, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ld1 > ld3;
    Thought lo4 = Thought353.getInstance(fd0, fd1, ld0, ld1);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
