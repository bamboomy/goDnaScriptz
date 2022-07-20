package genetic;
import java.util.ArrayList;
class Thought100 extends Thought{
private static ArrayList<Thought100> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 757.255872274168;
private double fd1 = 514.1829703242582;
private Thought fo0 = null;
private Thought fo1 = null;
Thought100 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought100 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought100 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought100 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought100 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought100 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought100 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought100 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought100 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought100 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought100 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought100 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought100 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought100 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought100 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought100 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought100 instance = new Thought100 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[0][7] += fd0;
    fd1 *= -1;
    fd0 *= -1;
    Thought lo0 = Thought340.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought216.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    if (fb0) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 952.7720802564837;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought282.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    Thought lo2 = Thought218.getInstance();
    boolean lb3 = true;
    ab1 = fd1 > ld0;
    ab2 = ab3 || ab4;
    double ld4 = 804.9585778529887;
    fb0 = ld4 > fd0;
    fb1 = fd1 > ld0;

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
    fb0 = !fb1;
    ad2 *= -1;
    boolean lb0 = true;
    Output.points[0][8] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb1);
}
        ad2 = ad3 + ad4;
        Thought lo2 = Thought397.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb1);
        lb0 = !fb0;
        fb1 = lb1 || lb0;
        Output.points[1][0] += ad3;
        double ld3 = 264.3091212735979;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb0, fb0, fb1);
}
        lb1 = ad3 > ad4;
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, ad1);
}
        lb1 = ad2 > ad3;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
    lb0 = ab1 || ab2;
    boolean lb1 = false;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    ab1 = !ab2;
    boolean lb2 = true;

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
    double ld0 = 276.2015201418274;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought329.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought248.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    double ld4 = 709.9274321253089;
    boolean lb5 = false;
if(fo0 != null){
      ld0 = fo0.m3(ld4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld0);
}
        boolean lb6 = false;
    Thought lo7 = Thought18.getInstance();
    ld4 = fd0 + fd1;
    boolean lb8 = true;
    boolean lb9 = false;
if(fo0 != null){
      fo0.m3(lb3, lb5, lb6, lb8);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld4, fd0, fd1, lb9, fb0, fb1, lb3);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld4, fd0, fd1, lb5, lb6, lb8, lb9);
}
    Thought lo10 = Thought244.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb3, lb5);
if(fo1 != null){
      lb6 = fo1.m2(ao1, ao2, ao3, ao4);
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
    fb1 = ad1 > ad2;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 356.197381375714;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ld1;
        ad1 = ad2 + ad3;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[1][1] -= fd1;
    fd0 = fd1 + fd0;
    Output.points[1][2] += fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    double ld1 = 524.3190710594672;

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
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
        fb0 = ad3 > ad4;
    fb1 = !ab1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;
    ad4 *= -1;

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
    Thought lo0 = Thought298.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought347.getInstance();
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought180.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    boolean lb3 = true;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb3);
}
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
return lb4;
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
        double ld0 = 927.2691836600745;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    double ld2 = 868.9585995064062;
    Thought lo3 = Thought304.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, lb1, ab1);
}
    ab2 = fd0 < fd1;
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab2 = fo0.m2(ld0, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
        boolean lb5 = true;
        boolean lb6 = true;
        lb5 = ld0 < ld2;
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb6, lb1, lb4, ab1);
}
        ld0 = ld2 + fd0;
        Output.points[1][3] += fd1;
        ab2 = ld0 < ld2;
        Thought lo7 = Thought180.getInstance(fo0, fo1, fo0, fo1);
        fd0 *= -1;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][4] -= ad2;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
        lb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    boolean lb2 = true;
    lb2 = !fb0;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb1 = lb0 || lb1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    lb2 = !fb0;
    fb1 = ad3 < ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, fb0);
}
    Thought lo3 = Thought24.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = false;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 *= -1;
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    double ld2 = 533.5694980826576;
    ad2 *= -1;
    ab3 = !ab4;
    double ld3 = 811.2363130814942;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld2;
    fb1 = !lb0;
    double ld4 = 915.7947788554059;
    lb1 = ab1 || ab2;
    boolean lb5 = false;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought47.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
    boolean lb2 = false;
    fd1 *= -1;
    double ld3 = 75.21787382276636;
    ld3 = fd0 - fd1;

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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought367.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 277.7722323528916;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    Output.points[1][5] += ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld1 = ad1 + ad2;
    ad3 *= -1;
if(ao1 != null){
          ao1.m1();
}
    fb1 = !fb0;
    double ld2 = 413.46048330254047;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(ao4 != null){
      fb0 = ao4.m2(ld1, ld2, ad1, ad2, fb1, lb3, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb3);
}
    Output.points[1][6] += ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, ld2);
}
    fb0 = ad1 > ad2;
    ad3 *= -1;
    fb1 = ad4 < fd0;

Thought.STACK_COUNTER++;
return lb3;
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
    double ld0 = 137.76675282203314;
    fd0 = fd1 + ld0;
    Output.points[1][7] += fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 > ld0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    ab1 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
        fb1 = fd0 < fd1;
    Output.points[1][8] += ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao3 != null){
      fd1 = ao3.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Thought lo0 = Thought40.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    ad2 *= -1;
    ad3 *= -1;
    ab4 = fb0 || fb1;
    ad4 *= -1;
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    lb1 = !ab1;

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
    double ld0 = 604.5319944625884;
    Thought lo1 = Thought391.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = fb0 || fb1;
    boolean lb2 = false;
        Thought lo3 = Thought1.getInstance();
    boolean lb4 = false;
    lb2 = lb4 || fb0;
    fb1 = lb2 || lb4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, lb4);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld0;
        fd0 = fd1 + ld0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb2, lb4, fb0);
}
        Thought lo5 = Thought180.getInstance(fd1, ld0, fd0, fd1, fb1, lb2, lb4, fb0);
        ld0 *= -1;
        boolean lb6 = false;
        Output.points[2][0] += fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb6, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
        }
    fb0 = fd0 < fd1;
    Thought lo7 = Thought373.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    Output.points[2][1] -= fd0;
    fd1 *= -1;
    fb1 = lb2 && lb4;

Thought.STACK_COUNTER++;
return ld0;
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
    fd1 *= -1;
    double ld0 = 4.111998846322266;
    boolean lb1 = true;
    Thought lo2 = Thought286.getInstance();
if(fo1 != null){
      ld0 = fo1.m3(lb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    double ld3 = 65.32422273893421;
    fd0 *= -1;
    fd1 = ld0 + ld3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld3, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ld0;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    fb1 = !fb0;
    fb1 = !fb0;
    double ld0 = 686.4434991216838;
    fb1 = ad3 < ad4;
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m1();
}
    ad2 *= -1;
    boolean lb2 = true;
    lb1 = lb2 && fb0;
    double ld3 = 44.15900948840894;
    ad2 *= -1;

Thought.STACK_COUNTER++;
return ad3;
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
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[2][2] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad1 < ad2;
    ab1 = !ab2;
    ab3 = !ab4;
    double ld0 = 190.64127884198638;
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld0;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      lb1 = fo0.m2();
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
    Output.points[2][3] += fd1;
    if (fb1) {
        boolean lb0 = true;
        fd0 = fd1 + fd0;
if(ao2 != null){
          lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
        boolean lb1 = true;
        fd0 *= -1;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
        fd1 *= -1;
        Output.points[2][4] += fd0;
        Thought lo2 = Thought381.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
        Thought lo3 = Thought344.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, lb1, fb0);
        fd1 = fd0 - fd1;
        fb1 = !lb0;
        fd0 *= -1;
        fd1 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb4 = true;
        lb1 = !lb4;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
    fb1 = fb0 && fb1;
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    Output.points[2][5] -= fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Output.points[2][6] += fd0;
    fb1 = !ab1;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    Output.points[2][7] -= fd0;
    fd1 = fd0 - fd1;
    double ld1 = 407.61352219620164;

Thought.STACK_COUNTER++;
return ld1;
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
    Thought lo0 = Thought175.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[2][8] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    lb1 = lb2 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[3][0] += ad2;
    ab2 = ad3 < ad4;
    ab3 = fd0 < fd1;
    double ld3 = 897.675921184687;
    Thought lo4 = Thought48.getInstance();
    boolean lb5 = true;
    ld3 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad3;
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
    Output.points[3][1] -= fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 633.4040307286397;
    double ld2 = 496.2197889259224;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb3 = false;
    lb0 = ld1 > ld2;

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
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
    if (ab3) {
        Output.points[3][2] += fd1;
        Output.points[3][3] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[3][4] -= fd1;
        boolean lb0 = false;
        Output.points[3][5] += fd0;
        fd1 = fd0 + fd1;
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
    ad1 = ad2 - ad3;
    fb1 = fb0 && fb1;
    fb0 = ad4 < fd0;
    Thought lo0 = Thought188.getInstance(fd1, ad1, ad2, ad3);
    Output.points[3][6] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    fb1 = ad3 < ad4;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    if (fb0) {
        Output.points[3][7] -= fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
if(fo0 != null){
          ad1 = fo0.m3(fb1, fb0, fb1, fb0);
}
        fb1 = ad2 > ad3;
        Thought lo1 = Thought30.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
        Output.points[3][8] += ad2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought185.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought140.getInstance(fo1, fo0, fo1, fo0);
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
    ab4 = !fb0;
    ad4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld1 = 434.5877579676406;
    Output.points[4][0] += ad4;
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;

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
    boolean lb1 = true;
    Thought lo2 = Thought218.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
}
    if (lb1) {
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb3 = true;
        fb0 = !fb1;
        } else {
if(ao1 != null){
          lb0 = ao1.m2();
}
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
return ao2;
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
    fb1 = ad2 > ad3;
    fb0 = fb1 && fb0;
    Output.points[4][1] -= ad4;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[4][2] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought51.getInstance();
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb2 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ao2;
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
    Thought lo0 = Thought221.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    Output.points[4][3] -= fd1;
    ab1 = !ab2;
    ab3 = ad1 > ad2;
    ad3 *= -1;
if(fo0 != null){
      ab4 = fo0.m2();
}
    Thought lo1 = Thought301.getInstance(fb0, fb1, ab1, ab2);
    double ld2 = 296.6307455044936;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld3 = 151.95041802965065;
    Output.points[4][4] += ld2;
    for(int i0=0; i0<10; i0++){
        ld3 = ad1 - ad2;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
}
Thought.STACK_COUNTER++;
return ao1;
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
    Thought lo0 = Thought234.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought187.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    fd1 = fd0 + fd1;
            fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    double ld2 = 398.532142884138;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fo0.m3();
}
    boolean lb3 = false;
        lb3 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb3, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb3, fb0, fb1, lb3);
}
    fb0 = fb1 && lb3;

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
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    double ld0 = 408.9613061280589;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought261.getInstance(fd1, ld0, fd0, fd1);
    ld0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 - fd1;
    Thought lo2 = Thought386.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    Output.points[4][5] -= fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;

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
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[4][6] += fd1;
    boolean lb1 = false;
    Thought lo2 = Thought128.getInstance(fd0, fd1, fd0, fd1);
    lb0 = fd0 > fd1;
    Output.points[4][7] += fd0;
    Output.points[4][8] -= fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
    double ld3 = 834.5403487876848;
    fb1 = ld3 > fd0;
    lb0 = !lb1;

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
