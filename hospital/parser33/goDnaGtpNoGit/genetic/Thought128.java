package genetic;
import java.util.ArrayList;
class Thought128 extends Thought{
private static ArrayList<Thought128> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 856.3782538954605;
private double fd1 = 744.7760507196742;
private Thought fo0 = null;
private Thought fo1 = null;
Thought128 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought128 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought128 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought128 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought128 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought128 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought128 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought128 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought128 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought128 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought128 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought128 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought128 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought128 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought128 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought128 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought128 instance = new Thought128 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = !lb1;
    fd0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[3][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    boolean lb3 = false;
    lb1 = lb2 && lb3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought374.getInstance();
    fb0 = fb1 || lb0;
    Output.points[3][8] -= fd1;

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
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought161.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
    double ld2 = 350.99369453635626;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 || ab1;
        ab2 = ab3 || ab4;
    if (fb0) {
        fb1 = !lb0;
        Thought lo3 = Thought282.getInstance(fd0, fd1, ld2, fd0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld0 = 754.1483710314835;
    double ld1 = 486.29347138863824;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 = ad1 - ad2;
    ad3 *= -1;
    Thought lo2 = Thought190.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        Thought lo4 = Thought71.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb1 = !lb3;
        fb0 = ad1 < ad2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        double ld5 = 188.61429060360632;
        fb1 = lb3 && fb0;
        boolean lb6 = true;
        double ld7 = 364.6881634897686;
        ld5 = ld7 - ld0;
        fb0 = fb1 && lb3;
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
    ab2 = ab3 && ab4;
    double ld0 = 478.21315286975937;
    boolean lb1 = false;
    Output.points[4][0] += ad1;
    ad2 = ad3 + ad4;
    ab4 = fb0 || fb1;
    fd0 = fd1 + ld0;
    Thought lo2 = Thought258.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Thought lo3 = Thought369.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought379.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb1);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    boolean lb5 = false;

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
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought124.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 957.7552676148828;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fd1 > ld1;
    Output.points[4][1] -= fd0;
        Output.points[4][2] -= fd1;

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
    ad1 *= -1;
    ad2 *= -1;
    Thought lo0 = Thought157.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    if (lb1) {
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
        if (fb1) {
            ad1 *= -1;
if(ao2 != null){
              ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
            boolean lb2 = false;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb2);
}
            boolean lb3 = true;
            lb3 = fd1 < ad1;
            lb1 = fb0 && fb1;
            double ld4 = 391.82770967765316;
            ad1 = ad2 + ad3;
            lb2 = !lb3;
            ad4 = fd0 - fd1;
if(ao3 != null){
              ld4 = ao3.m3(ao4, fo0, fo1, ao1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought388.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 > fd0;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    double ld4 = 766.0209247608029;
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    ld4 *= -1;
    boolean lb5 = true;
    Thought lo6 = Thought284.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0, lb2, lb3, lb5, ab1);
    Thought lo7 = Thought37.getInstance(fd1, ld4, fd0, fd1, ab2, ab3, ab4, fb0);

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
    Thought lo0 = Thought240.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    ad1 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought243.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
if(ao4 != null){
      ao4.m2();
}
    ab4 = fb0 && fb1;
    ab1 = fd0 < fd1;
        ab2 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        ab1 = ad3 < ad4;
        Thought lo2 = Thought326.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
        double ld3 = 313.94709668263107;
        boolean lb4 = false;
        ad2 *= -1;
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
    Thought lo0 = Thought200.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought378.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    Thought lo3 = Thought133.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb2);
}
    Thought lo5 = Thought385.getInstance(fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb2);
    double ld6 = 237.11397552751265;
    fd0 *= -1;
    boolean lb7 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb4, lb7, fb0, fb1);
}
    lb2 = lb4 && lb7;
    double ld8 = 982.7913816791139;

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
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought174.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    lb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    boolean lb3 = false;
    ab2 = ab3 && ab4;
    Thought lo4 = Thought148.getInstance(fb0, fb1, lb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab3 = ab4 || fb0;
    fb1 = lb1 && lb2;
    fd1 = fd0 + fd1;
    lb3 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought18.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    fd1 *= -1;
        fb0 = fb1 || lb0;
    Output.points[4][3] -= ad1;
    Thought lo2 = Thought78.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    Thought lo1 = Thought228.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    double ld0 = 692.8872858431781;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 < ld0;
    double ld1 = 447.6601807065833;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = ld0 > ld1;
    fd0 = fd1 + ld0;
    Output.points[4][4] += ld1;

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
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    lb0 = ad1 > ad2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought361.getInstance(ao3, ao4, fo0, fo1);
    double ld2 = 501.02043466615686;
    Output.points[4][5] -= ad4;
    fb0 = fd0 > fd1;
    Output.points[4][6] -= ld2;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    lb0 = fb0 && fb1;
    boolean lb3 = true;
    fd1 = ld2 - ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = !ab2;
    boolean lb1 = true;
    Thought lo2 = Thought223.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
    fd0 = fd1 - fd0;
    double ld3 = 97.45020825300946;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = lb0 || lb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld3, fd0, fd1);
}
    ld3 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb4 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
    ad3 *= -1;
    if (fb1) {
        ab1 = ab2 && ab3;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
        boolean lb0 = false;
        boolean lb1 = true;
        lb1 = ad2 < ad3;
        double ld2 = 570.7574474846898;
        boolean lb3 = true;
        lb3 = ab1 && ab2;
        Thought lo4 = Thought291.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
        lb0 = lb1 && lb3;
        ld2 = ad1 - ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3);
}
        boolean lb5 = true;
        Output.points[4][7] -= ad4;
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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought10.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
        fd1 *= -1;
        Thought lo2 = Thought94.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        Thought lo3 = Thought67.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
        lb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
        fb0 = fb1 || lb0;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
    boolean lb0 = true;
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 482.24587721956465;
    boolean lb2 = true;
    double ld3 = 227.3340513541005;
    Thought lo4 = Thought328.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
    double ld5 = 775.967900310984;
    Thought lo6 = Thought35.getInstance(ld3, ld5, fd0, fd1, ab4, fb0, fb1, lb0);
    ld1 = ld3 - ld5;
    fd0 = fd1 - ld1;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    ld5 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ld1, ld3, ld5, fd0);
}
    boolean lb7 = false;
    ab4 = fb0 && fb1;

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
    Output.points[4][8] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    boolean lb0 = true;
    lb0 = ad4 < fd0;
    Output.points[5][0] -= fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    if (lb1) {
        fb0 = ad1 > ad2;
        fb1 = lb0 && lb1;
        ad3 = ad4 - fd0;
        Thought lo2 = Thought168.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
        ad4 = fd0 + fd1;
        ad1 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
        fb1 = fd1 > ad1;
        Thought lo3 = Thought207.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = !ab2;
    ad1 *= -1;
    ab3 = ad2 > ad3;
    double ld1 = 142.29284106491806;
    double ld2 = 235.94090519545793;
    ab4 = fb0 && fb1;
    lb0 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo3 = Thought12.getInstance(ab2, ab3, ab4, fb0);
    fd1 *= -1;
    fb1 = !lb0;
        double ld4 = 927.5088807011582;
    ld1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, ld4, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, ld2, lb0, ab1, ab2, ab3);
}
    ld4 = ad1 + ad2;
    double ld5 = 550.897800946846;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    Output.points[5][1] += fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought77.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought75.getInstance();
if(fo1 != null){
      fo1.m2(fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb3 = false;
    boolean lb4 = true;

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
    if (fb1) {
if(ao1 != null){
          ao1.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[5][2] -= fd1;
        fb0 = ad1 < ad2;
        fb1 = ad3 < ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        Output.points[5][3] += fd0;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fb0 = ao1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        ad4 = fd0 + fd1;
        ad1 *= -1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao3.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        ad4 = fd0 + fd1;
        fb1 = ad1 > ad2;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][4] += fd1;
    ab2 = fd0 < fd1;
    fd0 *= -1;
    ab3 = ab4 || fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought243.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought190.getInstance();
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    Output.points[5][5] += fd0;
    boolean lb2 = false;
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb2, ab1, ab2);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 *= -1;
    Output.points[5][6] += fd1;
    double ld3 = 12.240779107523;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought185.getInstance();
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
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
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, fb0);
}
    Output.points[5][7] -= fd0;
    fb1 = !lb0;

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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought130.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 365.641089781518;
    boolean lb2 = true;
    lb2 = ld1 > fd0;
    ab1 = ab2 || ab3;
    fd1 = ld1 - fd0;
    Output.points[5][8] -= fd1;
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    if (lb2) {
        ld1 = fd0 - fd1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Output.points[6][0] += ad4;
    fd0 *= -1;
    Thought lo0 = Thought150.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Output.points[6][1] += fd0;
    fd1 = ad1 + ad2;
    fb0 = !fb1;
    boolean lb2 = false;
    lb1 = !lb2;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        double ld3 = 670.3645273909062;
        boolean lb4 = false;
        lb1 = ld3 > ad1;
        lb2 = ad2 < ad3;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad3 = fo0.m3();
}
if(fo1 != null){
          fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        boolean lb0 = true;
        Output.points[6][2] -= ad2;
        Output.points[6][3] += ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
        Thought lo1 = Thought82.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
    Output.points[6][4] += fd1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought281.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 646.4136608565385;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Output.points[6][5] += fd0;
if(ao1 != null){
      ao1.m3();
}
    Thought lo2 = Thought192.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo3 = Thought315.getInstance(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);

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
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && fb0;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    double ld2 = 587.9406731317549;
    boolean lb3 = true;
        ld2 = ad1 + ad2;
    lb0 = lb1 || lb3;
    fb0 = ad3 > ad4;
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      ao2.m2(lb0, lb1, lb3, fb0);
}
    double ld4 = 525.3244180811834;
    boolean lb5 = true;
    if (fb0) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 24.86766304811875;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
    fb1 = fd1 > ld0;
    Thought lo1 = Thought343.getInstance(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    Output.points[6][6] -= fd1;
    double ld2 = 239.10447348734544;

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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    double ld0 = 160.68108868243567;
        Output.points[6][7] += ld0;
    Thought lo1 = Thought209.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    double ld2 = 902.2895162640947;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = false;

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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 585.340457351322;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought35.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    boolean lb2 = true;
    lb2 = ld0 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
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
    boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought357.getInstance();
    double ld2 = 453.0528975337418;
if(fo0 != null){
      fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ld2;
    boolean lb3 = false;
    lb0 = fd0 > fd1;

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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought21.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        Thought lo1 = Thought131.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought161.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld4 = 198.4013074705319;
    double ld5 = 508.77376440884046;
    Output.points[6][8] -= ld4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb2;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    Thought lo6 = Thought21.getInstance(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld4, fb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m2(ld5, fd0, fd1, ld4, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    boolean lb7 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[7][0] -= ld5;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld4, ld5, fd0);
}
    fd1 = ld4 - ld5;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld5);
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
}
