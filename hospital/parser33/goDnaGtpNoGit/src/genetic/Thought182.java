package genetic;
import java.util.ArrayList;
class Thought182 extends Thought{
private static ArrayList<Thought182> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 785.0870520806773;
private double fd1 = 106.75435001191968;
private Thought fo0 = null;
private Thought fo1 = null;
Thought182 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought182 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought182 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought182 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought182 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought182 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought182 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought182 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought182 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought182 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought182 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought182 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought182 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought182 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought182 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought182 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought182 instance = new Thought182 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[1][2] += fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld0 = 51.76391257219027;
    fb0 = ld0 < fd0;
    Thought lo1 = Thought269.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld0;
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought290.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld2 = 267.53241099226847;
    fd0 = fd1 + ld2;
    Thought lo3 = Thought153.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
    Thought lo4 = Thought58.getInstance();
    fd1 = ld2 - fd0;
    boolean lb5 = true;
    boolean lb6 = true;
    lb5 = lb6 && ab1;
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb1, lb0, lb5, lb6);
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld2 + fd0;

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
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[1][3] += ad1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld0 = 505.34024179513955;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = ad1 > ad2;
    boolean lb2 = true;
    boolean lb3 = false;
    ad3 *= -1;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, fb0, fb1);
}
    lb1 = ad1 > ad2;
    double ld4 = 841.5108570176097;
    boolean lb5 = true;
    if (lb2) {
        lb3 = lb5 && fb0;
        fb1 = lb1 || lb2;
        lb3 = ad2 > ad3;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb5, fb0, fb1, lb1);
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
    double ld0 = 824.2422183586796;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    ab3 = fd1 > ld0;
    ab4 = ad1 < ad2;
    Thought lo1 = Thought361.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
    ad3 = ad4 - fd0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
          fo0.m2();
}
        ab1 = !ab2;
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
    fb0 = fd1 > fd0;
    Output.points[1][4] -= fd1;
        fb1 = !fb0;
    double ld0 = 45.483162629186836;
    ld0 *= -1;
    fb1 = fd0 < fd1;
    double ld1 = 19.786287595308167;
    boolean lb2 = true;
    ld0 *= -1;
if(ao2 != null){
      ld1 = ao2.m3(lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought346.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
}
    double ld4 = 566.543668346534;
        ld4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld1, ld4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ld4);
}
    double ld5 = 265.7648920093181;
    fb1 = ld5 > fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[1][5] += fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, ad1, ad2);
}
    Output.points[1][6] -= ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        lb1 = lb0 && fb0;
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
    double ld0 = 642.6380326820085;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    Output.points[1][7] += fd1;
    double ld1 = 305.47984625843236;
    ld0 *= -1;
    ld1 *= -1;
    Thought lo2 = Thought109.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1);
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd0 = fd1 + ld0;
    ab1 = ld1 < fd0;
    Thought lo3 = Thought208.getInstance(ab2, ab3, ab4, fb0);
    Thought lo4 = Thought111.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, ld1, fd0, fb1, ab1, ab2, ab3);
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
}
        lb5 = fd1 > ld0;
    double ld6 = 769.8923380354756;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    lb5 = ld1 < ld6;

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
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Thought lo1 = Thought31.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[1][8] -= ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    ab2 = ad1 > ad2;
    Output.points[2][0] += ad3;
    ab3 = ab4 && fb0;
    double ld3 = 170.48056195052934;
    fb1 = lb0 && lb2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2();
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
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[2][1] += fd1;
    Thought lo1 = Thought93.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    double ld2 = 560.5908557923186;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo3 = Thought243.getInstance(fb0, fb1, lb0, fb0);

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
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought30.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
        Output.points[2][2] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
        Output.points[2][3] += fd0;
        ab3 = fd1 > fd0;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
        boolean lb2 = true;
        fd1 *= -1;
        ab3 = fd0 > fd1;
        double ld3 = 892.0947635217213;
        ld3 = fd0 - fd1;
        Output.points[2][4] -= ld3;
        Thought lo4 = Thought257.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb1);
if(fo1 != null){
          lb2 = fo1.m2(fd1, ld3, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb1;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ld3 = fo0.m3(fd0, fd1, ld3, fd0);
}
        fd1 = ld3 + fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Output.points[2][5] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    boolean lb0 = false;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb1 = false;

Thought.STACK_COUNTER++;
return lb1;
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
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = !ab2;
    Output.points[2][6] += fd1;
    boolean lb0 = true;
    ab2 = ad1 > ad2;
    ab3 = ad3 < ad4;
    boolean lb1 = false;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, ab1);
}
    ab2 = !ab3;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    lb1 = lb2 || ab1;
    Output.points[2][7] += fd0;
    fd1 = ad1 + ad2;
    if (ab2) {
        ad3 = ad4 - fd0;
        if (ab3) {
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    double ld1 = 890.156356587864;
    Output.points[2][8] += ld1;
        fd0 = fd1 - ld1;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    Thought lo2 = Thought126.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb3 = false;
    lb0 = lb3 && fb0;
    fd1 *= -1;
    Output.points[3][0] += ld1;
    Thought lo4 = Thought202.getInstance(fb1, lb0, lb3, fb0);
    Output.points[3][1] += fd0;

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
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
    Output.points[3][2] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought165.getInstance(ao4, fo0, fo1, ao1);
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
        boolean lb1 = true;
    fb0 = ad2 < ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      fb1 = ao4.m2();
}
    lb1 = fb0 && fb1;
    Thought lo2 = Thought157.getInstance(lb1, fb0, fb1, lb1);

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    Output.points[3][3] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = fd1 > fd0;
    ab2 = !ab3;
    Thought lo1 = Thought95.getInstance(ao1, ao2, ao3, ao4);
    ab4 = fb0 && fb1;
if(fo0 != null){
          lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    fd1 = fd0 - fd1;
    Thought lo4 = Thought390.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
    fd0 = fd1 + fd0;
if(fo1 != null){
      lb3 = fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb5 = true;
    ab4 = fb0 && fb1;
    lb0 = fd1 > fd0;
    boolean lb6 = true;
    Thought lo7 = Thought360.getInstance(ao1, ao2, ao3, ao4, lb2, lb3, lb5, lb6);
    fd1 = fd0 - fd1;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought9.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      ad3 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[3][4] += ad4;
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    Thought lo2 = Thought86.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fb1 = !lb1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        double ld3 = 564.9181440472721;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, ld3, ad1);
}
        fb0 = ad2 < ad3;
        fb1 = lb1 && ab1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld3);
}
if(ao1 != null){
          ao1.m3();
}
        ad1 = ad2 - ad3;
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
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Output.points[3][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld1 = 257.888939163039;
    boolean lb2 = true;
    lb0 = lb2 || fb0;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 688.6858183230983;
    ld0 = fd0 - fd1;
    boolean lb1 = false;
    Thought lo2 = Thought293.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][6] -= ld0;
    Thought lo3 = Thought233.getInstance(fd0, fd1, ld0, fd0);
    ab1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb1;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
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
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb1 = fd1 < ad1;
    boolean lb0 = true;
    Thought lo1 = Thought342.getInstance(lb0, fb0, fb1, lb0);
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    double ld2 = 349.9942286416715;
    ad1 *= -1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought214.getInstance(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    fd1 *= -1;
    ab4 = !fb0;
    Thought lo1 = Thought138.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    double ld2 = 554.8874618851665;
    ab4 = fb0 && fb1;
    double ld3 = 691.6726566866258;
    boolean lb4 = true;
    lb4 = ld2 < ld3;
    boolean lb5 = true;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        lb5 = ad4 < fd0;
        fd1 = ld2 + ld3;
        ad1 = ad2 + ad3;
        Output.points[3][7] += ad4;
        }
    ab1 = !ab2;
    Thought lo6 = Thought11.getInstance(fo0, fo1, fo0, fo1);
    double ld7 = 628.0436422809045;
    ad4 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    double ld1 = 717.1417627248658;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m1(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    Output.points[3][8] += ad3;
    boolean lb0 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld2 = 284.71931534739446;
    fb0 = ld2 < ad1;

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
    fd1 = fd0 + fd1;
    Output.points[4][0] -= fd0;
    ab2 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought15.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought284.getInstance();
    Thought lo2 = Thought383.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        Output.points[4][1] -= fd0;
        double ld4 = 529.9701256424081;
        fb0 = !fb1;
        double ld5 = 388.23467326202046;
if(fo0 != null){
          lb3 = fo0.m2();
}
        Thought lo6 = Thought109.getInstance(ab1, ab2, ab3, ab4);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld5, fd0, fd1, ld4, fb0, fb1, lb3, ab1);
}
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
    ab1 = ab2 && ab3;
    ab4 = ad1 > ad2;
    fb0 = ad3 > ad4;
    Thought lo0 = Thought351.getInstance(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 > ad4;
    double ld1 = 974.5423627477047;
    Thought lo2 = Thought1.getInstance(ao2, ao3, ao4, fo0);
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld1);
}
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        ld1 = ad1 + ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        ld1 *= -1;
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        ld1 = ad1 + ad2;
        fb0 = fb1 && lb3;
        ab1 = ab2 && ab3;
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
    for(int i0=0; i0<10; i0++){
        double ld0 = 303.17201936906827;
        boolean lb1 = false;
if(fo1 != null){
          lb1 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
        Output.points[4][2] += fd1;
        Output.points[4][3] -= ld0;
        Output.points[4][4] -= fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld2 = 162.02159598608267;
        lb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(ld0, ld2, fd0, fd1);
}
        }
    Output.points[4][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought267.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld4 = 421.6066604311106;
    fb0 = fb1 || fb0;
    Thought lo5 = Thought86.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, fb1, fb0, fb1, fb0);
    Thought lo6 = Thought310.getInstance(fd1, ld4, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    ld4 = fd0 + fd1;
    fb1 = !fb0;
    ld4 *= -1;

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
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][6] += fd1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought8.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought217.getInstance(fb1, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld2 = 125.0109795103334;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb3 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought174.getInstance(fo0, fo1, fo0, fo1);
        ab1 = ab2 || ab3;
        Thought lo5 = Thought61.getInstance(ld2, fd0, fd1, ld2);
        boolean lb6 = true;
        Output.points[4][7] += fd0;
        ab3 = !ab4;
        Output.points[4][8] += fd1;
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
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    double ld0 = 314.5932092428549;
    ad3 *= -1;
    double ld1 = 425.5924123758565;
    ad3 *= -1;
    fb1 = ad4 > fd0;
    boolean lb2 = true;
    lb2 = !fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
    Output.points[5][0] += ld0;
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
}
    ad4 *= -1;
        fb0 = fb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
    fd0 *= -1;
    lb3 = !fb0;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 352.5009139153242;
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    ld0 *= -1;
    Thought lo3 = Thought19.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Thought lo4 = Thought265.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb1, lb2, lb5, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, lb2, lb5, ab1);
}
    boolean lb6 = true;
    Output.points[5][1] += ad1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[5][2] -= ad2;
    Thought lo7 = Thought91.getInstance(ad3, ad4, fd0, fd1);
    boolean lb8 = false;
    ab4 = fb0 || fb1;
    lb1 = ld0 > ad1;
    ad2 *= -1;

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
    if (fb1) {
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2();
}
if(ao1 != null){
          ao1.m2(fb1, fb0, fb1, fb0);
}
        fd1 = fd0 + fd1;
        double ld0 = 934.3931371027318;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        fb0 = !fb1;
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
    Thought lo0 = Thought73.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 - ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought205.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    double ld2 = 879.5214166189216;
    Output.points[5][3] -= ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    fd0 = fd1 - ld2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    if (ab2) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb0 = false;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
        Thought lo1 = Thought381.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought77.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
        Output.points[5][4] -= fd0;
        double ld3 = 801.2256311991007;
        ab2 = ab3 && ab4;
        fb0 = fd0 < fd1;
if(ao1 != null){
          fo1 = ao1.m4(ld3, fd0, fd1, ld3, fb1, lb0, ab1, ab2);
}
        Output.points[5][5] += fd0;
        fd1 *= -1;
if(ao2 != null){
          ld3 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    ab1 = !ab2;
    fd0 = fd1 + ad1;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    Output.points[5][6] -= ad2;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 = ad1 + ad2;
    ab2 = ad3 < ad4;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    ab1 = fd1 > ad1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Output.points[5][7] += fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 537.9437135095086;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
    lb1 = fd1 < ld0;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = !fb1;
    boolean lb2 = false;
    fd1 *= -1;
        ld0 = fd0 + fd1;
    lb1 = lb2 || fb0;
        fb1 = lb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    double ld0 = 232.97287776633885;
    fb1 = ld0 > fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb2 = true;
    Output.points[5][8] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ld0 *= -1;
        Output.points[6][0] += fd0;
    lb1 = lb2 || fb0;

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
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    double ld1 = 193.0639050857034;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld2 = 681.0677213108169;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought242.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought26.getInstance(ld2, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
    boolean lb5 = false;
if(fo0 != null){
      ld2 = fo0.m3();
}
    fd0 = fd1 + ld1;
    Output.points[6][1] += ld2;

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
