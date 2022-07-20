package genetic;
import java.util.ArrayList;
class Thought176 extends Thought{
private static ArrayList<Thought176> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 47.48223057737019;
private double fd1 = 475.5260604807596;
private Thought fo0 = null;
private Thought fo1 = null;
Thought176 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought176 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought176 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought176 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought176 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought176 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought176 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought176 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought176 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought176 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought176 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought176 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought176 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought176 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought176 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought176 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought176 instance = new Thought176 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = false;
        fd1 = fd0 - fd1;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[4][1] += fd1;
    fd0 *= -1;
    fb1 = lb1 && fb0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    fb0 = fb1 || lb1;
    Output.points[4][2] -= fd0;
    lb2 = fd1 < fd0;
        boolean lb3 = false;
    Thought lo4 = Thought243.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb1);
    lb2 = lb3 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb2, lb3);
}
    double ld5 = 437.25369907296897;

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
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    lb0 = lb1 || ab1;
    ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    Thought lo2 = Thought135.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    lb1 = ab1 && ab2;
    Output.points[4][3] -= fd0;
    ab3 = !ab4;
    fd1 = fd0 - fd1;
    double ld3 = 353.45528617090156;
    fb0 = ld3 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, ab1);
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
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = !lb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = ad4 > fd0;
    lb1 = lb2 || fb0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
    fb1 = !lb0;
    fd1 = ad1 + ad2;
    if (lb1) {
if(fo0 != null){
          lb2 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    boolean lb0 = false;
    double ld1 = 210.51554599019912;
if(fo1 != null){
      ad2 = fo1.m3(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = !ab1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 619.3868365881957;
    ld2 = ad1 - ad2;
    double ld3 = 135.16183311788285;
    Thought lo4 = Thought283.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld3);
}
    boolean lb5 = false;
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;

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
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought361.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    Thought lo1 = Thought114.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    double ld2 = 657.446251540402;
    ld2 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        ld2 = fd0 + fd1;
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
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
    double ld0 = 908.0610493473293;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    Thought lo1 = Thought330.getInstance(fb1, fb0, fb1, fb0);
    fd1 = ld0 + ad1;
    Output.points[4][4] -= ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = ad1 + ad2;

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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = ab1 || ab2;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[4][5] -= fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    double ld3 = 48.940373723424635;
    double ld4 = 643.237463911957;
    ab4 = fb0 || fb1;
    lb0 = lb1 && lb2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3();
}
    double ld0 = 230.0443363598652;
    boolean lb1 = true;
    ab1 = ad2 > ad3;
    Output.points[4][6] += ad4;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
    ad1 *= -1;
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        lb1 = ad4 < fd0;
        ab1 = ab2 && ab3;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
        ad4 = fd0 + fd1;
        ab4 = !fb0;
        ld0 = ad1 + ad2;
        boolean lb2 = true;
        ad3 = ad4 + fd0;
        Thought lo3 = Thought329.getInstance(fd1, ld0, ad1, ad2, fb0, fb1, lb2, lb1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[4][7] += fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    double ld0 = 55.71099124375206;
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = !fb0;
    fd0 = fd1 - ld0;
    fb1 = lb1 || fb0;
    double ld2 = 844.3308342187114;
    ld2 = fd0 - fd1;
    ld0 = ld2 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
}
    Output.points[4][8] += fd1;
    fb1 = ld0 < ld2;
    Thought lo3 = Thought166.getInstance();
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(lb1, lb4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, lb1, lb4, fb0, fb1);
}
    Output.points[5][0] -= fd0;
    boolean lb5 = false;
    Thought lo6 = Thought170.getInstance(fd1, ld0, ld2, fd0, lb1, lb4, lb5, fb0);

Thought.STACK_COUNTER++;
return fb1;
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought100.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][1] -= fd1;
    Thought lo2 = Thought312.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought297.getInstance();
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    boolean lb4 = false;
    Output.points[5][2] -= fd1;
    fd0 = fd1 + fd0;
    lb0 = lb4 || ab1;
    Thought lo5 = Thought159.getInstance(ab2, ab3, ab4, fb0);
    fb1 = lb0 && lb4;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb0 = lb4 || ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb4);
}

Thought.STACK_COUNTER++;
return ab1;
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
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    Output.points[5][3] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
    fb0 = fb1 && lb0;
    double ld1 = 992.643704431486;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    ld1 *= -1;
    fb0 = !fb1;
    lb0 = !fb0;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    lb0 = fb0 || fb1;

Thought.STACK_COUNTER++;
return lb0;
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    boolean lb0 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ad1 < ad2;
    double ld1 = 214.9090571018699;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    Thought lo3 = Thought5.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought260.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought63.getInstance(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
    Output.points[5][4] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = lb1 && fb0;
    double ld3 = 429.17329930939565;
    Thought lo4 = Thought270.getInstance();
    double ld5 = 876.557062250927;
if(ao4 != null){
      ao4.m3(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld5, fd0, fd1, ld3, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      ao4 = fo0.m4(ld5, fd0, fd1, ld3, fb0, fb1, lb1, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
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
    fb0 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    double ld0 = 397.5774191530898;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ad1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
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
    boolean lb0 = false;
    lb0 = !ab1;
    ab2 = !ab3;
    Thought lo1 = Thought278.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    ab1 = ab2 || ab3;
    double ld2 = 829.4684852288727;
    ab4 = fd0 > fd1;
    fb0 = ld2 < fd0;
    fb1 = lb0 && ab1;
    Thought lo3 = Thought262.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fd1 *= -1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = lb0 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    ab2 = fd1 > ld2;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    ab3 = ab4 && fb0;
    Output.points[5][5] -= ld2;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ab1;
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
    boolean lb0 = true;
    lb0 = ad2 < ad3;
    ab1 = !ab2;
    boolean lb1 = false;
    ab2 = ad4 < fd0;
if(ao1 != null){
      ab3 = ao1.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    if (lb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        boolean lb2 = true;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            ad1 *= -1;
            double ld3 = 821.2044328398329;
            boolean lb4 = false;
            Output.points[5][6] -= ad1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb0 = false;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 < fd1;
        Thought lo1 = Thought271.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
        Output.points[5][7] -= fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        boolean lb2 = false;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
}
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
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2();
}
    double ld1 = 426.0907005368679;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld1 = fd0 + fd1;
    if (lb0) {
        Thought lo2 = Thought218.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
        Output.points[5][8] -= ld1;
        Thought lo3 = Thought308.getInstance(fo0, fo1, fo0, fo1);
        fd0 *= -1;
}
Thought.STACK_COUNTER++;
return fd1;
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
    ad1 = ad2 + ad3;
    fb1 = fb0 || fb1;
    Output.points[6][0] += ad4;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    fd0 *= -1;
    Thought lo0 = Thought10.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought51.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought10.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1);
}
    double ld3 = 236.60509372484069;

Thought.STACK_COUNTER++;
return ad1;
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
    Thought lo0 = Thought211.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    boolean lb1 = true;
    Thought lo2 = Thought98.getInstance();
    Output.points[6][1] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld3 = 807.0521539951277;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
    if (ab3) {
        Output.points[6][2] += ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld3, ad1, ab4, fb0, fb1, lb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        fb1 = lb0 || fb0;
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = fd0 > fd1;
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
        lb0 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        double ld1 = 544.7456390083202;
if(ao3 != null){
          ao3.m3();
}
        boolean lb2 = true;
        boolean lb3 = true;
}
Thought.STACK_COUNTER++;
return fd1;
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
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought281.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    fb1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    if (lb1) {
        fb0 = fb1 || lb1;
        fb0 = !fb1;
        double ld2 = 440.7650042621346;
        fd0 = fd1 + ld2;
if(ao4 != null){
          ao4.m1();
}
        lb1 = fb0 && fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao1 != null){
      ao1.m3(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
    boolean lb0 = false;
    Output.points[6][3] += fd1;
    lb0 = !ab1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        double ld1 = 280.8792790993526;
    fb1 = lb0 && ab1;
    ab2 = ab3 && ab4;
    boolean lb2 = true;
    fd0 *= -1;
    Output.points[6][4] -= fd1;
if(ao1 != null){
      ld1 = ao1.m3(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
    lb2 = ab1 && ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd1 = ld1 - fd0;
    boolean lb3 = true;
    fd1 = ld1 - fd0;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fd1;
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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought13.getInstance(ad4, fd0, fd1, ad1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    double ld1 = 734.3158358037915;
    ab2 = fd0 < fd1;
if(fo1 != null){
      ld1 = fo1.m3();
}
    boolean lb2 = false;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m2(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1, fb1, lb2, ab1, ab2);
}
    ad1 = ad2 + ad3;
    boolean lb3 = true;
    Output.points[6][5] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[6][6] += ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb2, lb3, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m1();
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought143.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought175.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb3 = fb0 || fb1;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought367.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    ab2 = fd1 < fd0;
    ab3 = !ab4;
    boolean lb2 = true;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought275.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ad1;
    lb0 = fb0 && fb1;
    Thought lo2 = Thought148.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    double ld3 = 890.0913231418936;
    fd0 = fd1 - ld3;
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd1 = ld3 + ad1;
    fb0 = !fb1;
    lb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
        fb0 = fb1 && lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = ad2 > ad3;
    ad4 *= -1;
    boolean lb3 = false;
    Output.points[6][7] -= fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb4 = true;
    boolean lb5 = true;
    lb1 = fd0 > fd1;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb7 = false;
    ad1 = ad2 + ad3;
    boolean lb8 = false;
    lb2 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb3, lb4, lb5, lb6);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb7, lb8, ab1, ab2);
}
    fd0 = fd1 - ad1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 *= -1;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        lb1 = fd0 > fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(ao3 != null){
          fb0 = ao3.m2();
}
if(ao4 != null){
          fd1 = ao4.m3(fb1, lb0, lb1, fb0);
}
        boolean lb2 = false;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb2, lb0, lb1);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
          ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought122.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
    boolean lb2 = false;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 *= -1;
    Thought lo3 = Thought89.getInstance(lb2, fb0, fb1, lb1);
    double ld4 = 845.9413819511719;
    Output.points[6][8] -= ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
}
    lb2 = ld4 < ad1;
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought98.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought303.getInstance(ab4, fb0, fb1, ab1);
    Output.points[7][0] -= fd0;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Output.points[7][1] -= fd0;
    fd1 *= -1;
    Output.points[7][2] -= fd0;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
        double ld0 = 555.0016710703748;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld1 = 779.750017885076;
    ld0 *= -1;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld0, ld1, ad1, ad2, ab4, fb0, fb1, lb2);
}
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, ab1);
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
    fb0 = fb1 && fb0;
        fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, fb0);
}
    boolean lb3 = true;
    fb0 = fd0 > fd1;
    Output.points[7][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    Output.points[7][4] -= fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[7][5] += fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 592.7595343164788;
if(fo0 != null){
      lb0 = fo0.m2();
}
    fd0 *= -1;
    fd1 = ld1 + fd0;

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
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    double ld0 = 161.00906520257053;
    fb1 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought375.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld0;
        Output.points[7][6] += fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][7] -= fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    fb1 = !fb0;

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
