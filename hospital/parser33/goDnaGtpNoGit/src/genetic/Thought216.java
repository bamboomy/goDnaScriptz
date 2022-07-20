package genetic;
import java.util.ArrayList;
class Thought216 extends Thought{
private static ArrayList<Thought216> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 219.45963071744862;
private double fd1 = 338.26242265406654;
private Thought fo0 = null;
private Thought fo1 = null;
Thought216 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought216 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought216 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought216 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought216 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought216 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought216 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought216 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought216 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought216 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought216 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought216 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought216 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought216 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought216 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought216 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought216 instance = new Thought216 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought115.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd0 *= -1;

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
    ab2 = fd1 < fd0;
    fd1 *= -1;
    ab3 = fd0 < fd1;
    if (ab4) {
        fd0 *= -1;
        fb0 = fb1 || ab1;
if(fo1 != null){
          fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        fd1 = fd0 - fd1;
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
    fb1 = !fb0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    Thought lo2 = Thought249.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld3 = 253.78592884883994;
if(fo0 != null){
      fo0.m2(ld3, ad1, ad2, ad3);
}
    double ld4 = 58.56298965283926;
    boolean lb5 = true;
    lb1 = !lb5;
    Thought lo6 = Thought118.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    fb0 = !fb1;
    lb0 = ld3 > ld4;
if(fo1 != null){
      ad1 = fo1.m3();
}
    Thought lo7 = Thought63.getInstance(lb1, lb5, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        lb0 = ad2 < ad3;
        double ld8 = 748.6752733689976;
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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ab2 = ab3 || ab4;
    double ld0 = 803.1278290997275;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
        ad2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        double ld1 = 813.8994662551052;
        ld1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        ab1 = fd0 < fd1;
        double ld2 = 586.631099937223;
        ld1 *= -1;
        ab2 = ld2 > ld0;
        Output.points[5][7] -= ad1;
        ab3 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
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
if(ao2 != null){
      fb1 = ao2.m2();
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought119.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;

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
    fb0 = fb1 || fb0;
    fb1 = ad2 < ad3;
    fb0 = fb1 && fb0;
    double ld0 = 566.6075744707729;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    fb0 = ad3 > ad4;
    fb1 = !lb1;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    boolean lb2 = false;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 51.02537514656231;
    boolean lb1 = true;
    Output.points[5][8] -= fd0;
    lb1 = fd1 > ld0;
if(ao4 != null){
      fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld0;
    if (fb1) {
        Thought lo2 = Thought75.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
        ab4 = fd1 < ld0;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ld0 = ao4.m3(fo0, fo1, ao1, ao2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    double ld0 = 539.7008485581304;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ad2 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Output.points[6][0] -= ad3;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    ab4 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
}
    ad4 = fd0 + fd1;
    ab2 = ld0 < ad1;
    boolean lb2 = true;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ab2 = !ab3;
    boolean lb3 = true;

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
    double ld0 = 468.19135908714594;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb2 = false;
    Thought lo3 = Thought390.getInstance(lb2, fb0, fb1, lb1);
    Output.points[6][1] += fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    lb2 = fd1 > ld0;
    double ld4 = 201.68130689428455;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    Thought lo5 = Thought159.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld0);
}
    double ld6 = 679.0573776260843;
    ld4 = ld6 + fd0;
    fd1 = ld0 - ld4;
    Output.points[6][2] += ld6;

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
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
    double ld0 = 413.5010996596627;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo1.m2(ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
        fd0 = fd1 + ld0;
        Output.points[6][3] += fd0;
        Thought lo1 = Thought213.getInstance(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
        ld0 = fd0 - fd1;
        Output.points[6][4] += ld0;
        ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        fd0 = fd1 - ld0;
        fd0 = fd1 + ld0;
        boolean lb2 = true;
        ab4 = fd0 < fd1;
        boolean lb3 = false;
        if (ab4) {
}}
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
    if (fb1) {
        fb0 = !fb1;
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        ad3 *= -1;
        fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
        boolean lb0 = false;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ab2 = ab3 || ab4;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m3(fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought317.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
    double ld1 = 286.27938886184506;
    ld1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought366.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fb1 || lb1;

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
    Output.points[6][5] -= ad2;
    Thought lo0 = Thought386.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;
    Thought lo3 = Thought6.getInstance(fo1, ao1, ao2, ao3);
    lb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    lb1 = lb2 || fb0;
    double ld4 = 277.72336961597154;

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
    fd0 = fd1 + fd0;
    ab1 = !ab2;
    Thought lo0 = Thought214.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Output.points[6][6] -= fd1;
    double ld1 = 653.3626572752494;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = ld1 < fd0;
    fb0 = fd1 > ld1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ab3 = ao3.m2();
}
    ad4 *= -1;
    ab4 = fd0 < fd1;
    boolean lb1 = true;
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, lb1, ab1);
}
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
    double ld2 = 225.06391741700958;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    ab1 = ld2 > ad1;
    ad2 = ad3 - ad4;
    ab2 = fd0 < fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought359.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Output.points[6][7] -= fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
    Output.points[6][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && ab1;
    double ld0 = 775.2725444419552;
    double ld1 = 329.5925417168146;
    double ld2 = 57.88554512684314;
    ld1 = ld2 + fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld2, ab3, ab4, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    Output.points[7][0] += fd1;
    ad1 *= -1;
        double ld0 = 713.3919599510521;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
            if (fb1) {
                ld0 *= -1;
                fb0 = fb1 || fb0;
                double ld1 = 828.1174540342513;
if(fo0 != null){
                  fo1 = fo0.m4();
}
if(fo1 != null){
                  ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}
                fb1 = !fb0;
                Thought lo2 = Thought324.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = !ab4;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ad3 < ad4;
    Output.points[7][1] -= fd0;
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    lb0 = ab1 && ab2;
    boolean lb1 = false;
    fd0 *= -1;
    double ld2 = 234.6977237052975;
    boolean lb3 = true;
    fd0 *= -1;
    fd1 *= -1;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ld2 + ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb4 = ab1 || ab2;
    double ld5 = 708.7740801475043;
    Thought lo6 = Thought27.getInstance(ab3, ab4, fb0, fb1);

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
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought148.getInstance(ao1, ao2, ao3, ao4);
    Output.points[7][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[7][3] += fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fd1 = ad1 - ad2;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld1 = 47.455296027577745;
    fb0 = ad3 < ad4;
    double ld2 = 202.2944761460674;
    boolean lb3 = false;
    ad4 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    boolean lb0 = false;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[7][4] += fd0;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4();
}
        for(int i0=0; i0<10; i0++){
            for(int i1=0; i1<10; i1++){
                fd1 *= -1;
                fd0 = fd1 + fd0;
if(fo0 != null){
                  ao4 = fo0.m4(fb1, lb0, ab1, ab2);
}
                ab3 = fd1 > fd0;
                fd1 = fd0 + fd1;
if(ao1 != null){
                  fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
}}}
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
    ab2 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ad1;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb1 = false;
    ad2 *= -1;
if(ao3 != null){
      ab4 = ao3.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    Thought lo2 = Thought215.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
    Thought lo3 = Thought315.getInstance();
    fb1 = ad1 < ad2;
    double ld4 = 135.92883514317575;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          lb0 = ao2.m2(lb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought285.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought220.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb2);
}
    double ld4 = 256.4814371604713;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought331.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1();
}
    for(int i0=0; i0<10; i0++){
        ab2 = fd1 < fd0;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        double ld2 = 971.2213978275342;
        fb1 = lb1 || ab1;
        Thought lo3 = Thought271.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fd1, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        lb1 = ld2 > fd0;
        fd1 = ld2 + fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Output.points[7][5] -= fd1;
        ld2 *= -1;
        fd0 *= -1;
        fd1 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb1 = ld2 < fd0;
        lb1 = ab1 || ab2;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo1.m2(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo1 != null){
          fo0 = fo1.m4();
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 741.3960626300982;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
        lb1 = !fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    Thought lo3 = Thought120.getInstance(fo1, fo0, fo1, fo0);
    Thought lo4 = Thought78.getInstance(ad1, ad2, ad3, ad4);

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
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab2 = ab3 && ab4;
    fb0 = ad2 < ad3;
    fb1 = ab1 && ab2;
    ad4 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}

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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 511.2461701673376;
    fb0 = ld0 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld0;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, fd0);
}
    Thought lo3 = Thought209.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
    double ld4 = 613.8260260845587;
    lb2 = fb0 || fb1;
    boolean lb5 = false;
if(ao1 != null){
      ao1.m3();
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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought382.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[7][6] += ad4;
    Output.points[7][7] += fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad3 *= -1;
    Thought lo1 = Thought93.getInstance(ad4, fd0, fd1, ad1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought128.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    ab2 = fd1 < fd0;
if(fo0 != null){
      fo0.m1();
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ab2 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
        fd0 *= -1;

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
    double ld0 = 282.3614514799239;
    double ld1 = 191.36595866309193;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld2 = 972.7217601367197;
    double ld3 = 482.23443860063503;
    ld1 = ld2 - ld3;
    boolean lb4 = false;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb4 = !ab1;
    ad4 *= -1;
    double ld5 = 639.3719694318744;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld0, ld1);
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo0 != null){
          fo0.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought183.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought362.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought339.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m2(lb0, lb3, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb3, fb0, fb1);
}
    lb0 = !lb3;
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
    boolean lb5 = true;
    Thought lo6 = Thought100.getInstance(fd0, fd1, fd0, fd1, lb3, lb5, fb0, fb1);
    lb0 = lb3 && lb5;

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
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought113.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Output.points[7][8] -= fd1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 189.16656218104887;
    boolean lb3 = false;
    lb3 = ld2 > fd0;
        Thought lo4 = Thought259.getInstance(fb0, fb1, lb1, lb3);
    Output.points[8][0] -= fd1;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb5, fb0, fb1, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1, lb3, lb5, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb3, lb5, fb0, fb1);
}
    boolean lb6 = true;
    Output.points[8][1] -= ld2;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    Output.points[8][2] -= fd1;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    Output.points[8][3] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = !lb0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    double ld2 = 602.6566344163228;
    double ld3 = 42.94174561258094;
    Thought lo4 = Thought319.getInstance(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, fb0, fb1, lb0, lb1);

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
