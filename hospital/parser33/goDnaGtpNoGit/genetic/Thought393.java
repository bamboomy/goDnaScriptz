package genetic;
import java.util.ArrayList;
class Thought393 extends Thought{
private static ArrayList<Thought393> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 407.21759443247964;
private double fd1 = 181.34039395392603;
private Thought fo0 = null;
private Thought fo1 = null;
Thought393 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought393 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought393 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought393 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought393 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought393 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought393 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought393 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought393 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought393 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought393 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought393 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought393 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought393 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought393 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought393 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought393 instance = new Thought393 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[1][3] -= fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought250.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    double ld2 = 809.4898984853885;
    double ld3 = 830.2361768231741;
    boolean lb4 = false;
    boolean lb5 = true;
    double ld6 = 699.8425047963439;
    Output.points[1][4] += ld2;

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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[1][5] -= fd1;
    fb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = lb2 && lb3;
    double ld4 = 821.6319825231659;
    fd0 = fd1 + ld4;

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
    double ld0 = 712.1418894398745;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 206.4956086585661;
if(fo1 != null){
      ad4 = fo1.m3(ab3, ab4, fb0, fb1);
}
    Output.points[1][6] += fd0;
    double ld3 = 984.3109592508515;
    lb1 = fd0 > fd1;
    ab1 = ld0 > ld2;
    ld3 *= -1;
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld3, ab3, ab4, fb0, fb1);
}
        lb1 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    double ld0 = 1000.4934450643192;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = fb1 || fb0;
    double ld1 = 34.74761407109568;
    fb1 = ld0 < ld1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, ld1, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;
        lb2 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = !fb0;
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought348.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
}
    double ld3 = 561.6370312150839;
    fb0 = fb1 && lb0;
    boolean lb4 = true;
    lb2 = ad3 > ad4;
    Output.points[1][7] -= fd0;
    fd1 = ld3 + ad1;
    Thought lo5 = Thought101.getInstance(fo0, fo1, ao1, ao2);
    boolean lb6 = false;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    double ld0 = 112.04028004490435;
if(ao3 != null){
      ld0 = ao3.m3();
}
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    Thought lo1 = Thought285.getInstance(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    boolean lb2 = false;
    double ld3 = 519.3609633572513;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    ld3 = fd0 + fd1;
    ld0 *= -1;
    ld3 = fd0 - fd1;
    ld0 = ld3 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo4 = Thought188.getInstance(ld0, ld3, fd0, fd1);
    double ld5 = 165.7274837622308;
    Thought lo6 = Thought342.getInstance(ao3, ao4, fo0, fo1, ld0, ld3, ld5, fd0);
    fd1 = ld0 + ld3;
    Output.points[1][8] -= ld5;
if(ao1 != null){
      ao1.m1();
}
    fb0 = !fb1;
    double ld7 = 12.000960029861503;

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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought101.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
    ab2 = !ab3;
    double ld2 = 22.620374569908147;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        double ld3 = 674.3704668726889;
        double ld4 = 631.8077067426026;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
        Thought lo5 = Thought184.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ld3);
}
        ld4 = ld2 + ad1;
if(ao4 != null){
          ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        ld3 *= -1;
if(ao3 != null){
          ao3.m1();
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 100.74564631461608;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    double ld1 = 561.6354436409392;
    Thought lo2 = Thought196.getInstance(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 && fb1;
        fb0 = fd1 < ld0;
        ld1 *= -1;
        }
    fd0 *= -1;
    boolean lb3 = false;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    double ld0 = 353.27639136079864;
    fb1 = !ab1;
    if (ab2) {
        ld0 *= -1;
if(fo1 != null){
          ab3 = fo1.m2(fd0, fd1, ld0, fd0);
}
        Thought lo1 = Thought364.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
        double ld2 = 893.8758897485237;
        ab4 = ld2 > ld0;
        fd0 = fd1 - ld2;
        ld0 = fd0 + fd1;
        Thought lo3 = Thought204.getInstance();
        ld2 = ld0 - fd0;
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
    ad1 = ad2 + ad3;
    fb1 = fb0 && fb1;
    ad4 *= -1;
    Thought lo0 = Thought258.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = ad3 > ad4;
        double ld1 = 778.9630891910466;
        Output.points[2][0] -= ad4;
        fd0 *= -1;
        fd1 = ld1 - ad1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        double ld2 = 152.67516795484372;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb0 = false;
        boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ad1 + ad2;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Output.points[2][1] += ad1;
if(fo0 != null){
      fo0.m1(lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
    boolean lb3 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld4 = 739.5482905246819;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ld4, ad1, ad2, ad3);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    double ld0 = 33.185808202154234;
    if (fb0) {
        Output.points[2][2] -= fd0;
        fd1 = ld0 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
        Output.points[2][3] += ld0;
if(ao1 != null){
          ao1.m1();
}
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
        fb1 = lb1 && fb0;
        fb1 = !lb1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
        fd1 *= -1;
if(ao3 != null){
          fb1 = ao3.m2(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad2 *= -1;
    double ld0 = 128.54161911416682;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought80.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fb0 || fb1;

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
    ab2 = !ab3;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 = fd0 - fd1;
    double ld1 = 451.4078423322955;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    double ld2 = 841.4082845871283;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 = ld2 - fd0;
    boolean lb3 = true;
    boolean lb4 = false;
    ab4 = fb0 || fb1;
    boolean lb5 = true;
    fd1 = ld1 - ld2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    double ld0 = 442.7285295803181;
    ab3 = ab4 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    double ld2 = 190.76744471307865;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought15.getInstance(ld2, ad1, ad2, ad3);
    ad4 *= -1;
    fd0 = fd1 + ld0;
    ab1 = ld2 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought194.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld2, ad1, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;

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
        fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    double ld0 = 808.5028098480744;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    Thought lo3 = Thought72.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(lb2, fb0, fb1, lb1);
}
    ld0 = fd0 - fd1;
    Thought lo4 = Thought388.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
    lb2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
    boolean lb5 = true;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb1);
}
    lb2 = fd1 > ld0;
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought65.getInstance();
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld2 = 373.8836019671128;
    Output.points[2][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    Thought lo3 = Thought308.getInstance(fd1, ld2, fd0, fd1);
    Thought lo4 = Thought181.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
    Output.points[2][5] += fd0;
    fd1 = ld2 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, ab1, ab2);
}
    double ld5 = 99.34649208436704;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld5, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought231.getInstance(ld2, ld5, fd0, fd1, lb1, ab1, ab2, ab3);
    ld2 = ld5 + fd0;
    ab4 = fb0 && fb1;
    Output.points[2][6] += fd1;

Thought.STACK_COUNTER++;
return ld2;
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
    boolean lb0 = true;
    lb0 = !fb0;
    double ld1 = 740.9653513101093;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    ad1 = ad2 - ad3;
    Output.points[2][7] -= ad4;
    fb0 = fd0 > fd1;
    fb1 = lb0 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ld1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    double ld3 = 447.0248467328029;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, ad1, ad2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2();
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 > ad2;
    if (ab2) {
        ad3 = ad4 - fd0;
        Thought lo0 = Thought338.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
        Output.points[2][8] += fd1;
        ab1 = ad1 < ad2;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
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
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[3][0] += fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought117.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    boolean lb1 = false;

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
if(ao2 != null){
      ao2.m1();
}
    double ld0 = 383.3641252135478;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought331.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
    Output.points[3][1] += ad2;
    Thought lo2 = Thought16.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld3 = 931.6309842910807;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    Output.points[3][2] -= ld0;
    double ld4 = 182.18073594604024;
    double ld5 = 700.9674887464959;
    ld3 = ld4 + ld5;
    fb0 = ad1 > ad2;
    double ld6 = 427.0836511372279;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][3] -= fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    fd0 *= -1;
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
    Output.points[3][4] += fd1;
    double ld0 = 999.3038486652681;
    ab4 = !fb0;
    ld0 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 *= -1;
    Output.points[3][5] -= fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m3();
}
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
    double ld1 = 130.62683353471425;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] += fd0;
    fb0 = fb1 || fb0;
    double ld0 = 963.2287711682608;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < ld0;
        double ld1 = 976.579736570591;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld1, ld0);
}
        fb0 = !fb1;
        Output.points[3][7] -= fd0;
        if (fb0) {
            fb1 = !fb0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo0 = Thought98.getInstance(fb1, ab1, ab2, ab3);
    double ld1 = 969.4861358656648;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld2 = 909.3852353807974;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld1 *= -1;
if(fo0 != null){
      fo0.m2(ld2, fd0, fd1, ld1);
}
    fb0 = ld2 > fd0;
    double ld3 = 226.5433145708232;
    double ld4 = 157.15973909455371;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld1);
}
    Thought lo6 = Thought94.getInstance();
    fb0 = fb1 || lb5;
    ld2 = ld3 - ld4;
    boolean lb7 = false;

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
    double ld0 = 490.3798143785057;
        Thought lo1 = Thought225.getInstance(fb1, fb0, fb1, fb0);
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    Output.points[3][8] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ad4 = fo0.m3(fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;

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
    ab1 = ab2 || ab3;
    Output.points[4][0] += ad2;
    ad3 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 < ad2;
    boolean lb0 = true;
    ab2 = ad3 > ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
    double ld1 = 785.640812800888;
    Output.points[4][1] += ad4;
    double ld2 = 523.333490023545;

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
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 *= -1;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = !lb1;
    Thought lo3 = Thought130.getInstance(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
    lb1 = fd1 > fd0;
    Thought lo4 = Thought153.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[4][2] -= fd1;
    Thought lo5 = Thought176.getInstance(lb2, fb0, fb1, lb0);
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
        lb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      lb2 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    double ld6 = 254.92124647738558;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb0);
}
    double ld7 = 520.7578587006814;
    lb1 = lb2 || fb0;

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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld1 = 710.4090293372843;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2);
}
    boolean lb2 = true;
    lb0 = lb2 && fb0;
if(ao2 != null){
      ao2.m1();
}
    fb1 = ad3 < ad4;
if(ao3 != null){
      fd0 = ao3.m3(lb0, lb2, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2, lb0, lb2, fb0, fb1);
}
    Thought lo3 = Thought299.getInstance(ad3, ad4, fd0, fd1, lb0, lb2, fb0, fb1);
    ld1 = ad1 + ad2;
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, lb2, lb4, fb0, fb1);
}
        ad3 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad4 = fd0 + fd1;
        for(int i1=0; i1<10; i1++){
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    if (lb1) {
if(ao1 != null){
          fd0 = ao1.m3();
}
        Thought lo2 = Thought33.getInstance(ab1, ab2, ab3, ab4);
        if (fb0) {
            fd1 *= -1;
            double ld3 = 262.87712892705935;
if(ao2 != null){
              ld3 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0, fb1, lb0, lb1, ab1);
}
            Thought lo4 = Thought169.getInstance(fd1, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb1, ab1);
}
            boolean lb5 = true;
            if (ab1) {
                ld3 = fd0 + fd1;
}}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    if (ab4) {
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
        boolean lb0 = false;
        fb0 = ad4 < fd0;
        Output.points[4][3] += fd1;
        ad1 = ad2 + ad3;
if(ao1 != null){
          ao1.m2();
}
        fb1 = lb0 && ab1;
        ab2 = ab3 || ab4;
        ad4 = fd0 - fd1;
        Thought lo1 = Thought251.getInstance(fb0, fb1, lb0, ab1);
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        boolean lb2 = true;
        Output.points[4][4] += ad4;
        Output.points[4][5] += fd0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        lb0 = !lb2;
        } else if (ab3) {
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
    Thought lo0 = Thought235.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = false;
    lb2 = lb3 || lb4;
    fb0 = fb1 && lb1;
        Thought lo5 = Thought278.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3();
}
    boolean lb6 = false;
    fd1 = fd0 - fd1;
    Thought lo7 = Thought271.getInstance(lb2, lb3, lb4, lb6);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    boolean lb8 = true;
    double ld9 = 39.733948694024434;
    double ld10 = 329.5351242226154;
    lb3 = ld10 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld9, ld10, fd0, lb4, lb6, lb8, fb0);
}
    Thought lo11 = Thought188.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
    lb4 = fd1 > ld9;
    lb6 = !lb8;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ld10 < fd0;
    Thought lo12 = Thought255.getInstance(fd1, ld9, ld10, fd0);

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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought345.getInstance();
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Output.points[4][6] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = !fb0;
    Thought lo1 = Thought175.getInstance();
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;

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
