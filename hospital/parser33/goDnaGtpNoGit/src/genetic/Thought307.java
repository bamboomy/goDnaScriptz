package genetic;
import java.util.ArrayList;
class Thought307 extends Thought{
private static ArrayList<Thought307> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 432.0996980859593;
private double fd1 = 602.3692369327684;
private Thought fo0 = null;
private Thought fo1 = null;
Thought307 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought307 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought307 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought307 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought307 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought307 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought307 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought307 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought307 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought307 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought307 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought307 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought307 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought307 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought307 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought307 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought307 instance = new Thought307 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 799.7243965619182;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    fb1 = fb0 && fb1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 404.4360645985783;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1);
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    boolean lb0 = true;
    Output.points[5][5] += fd1;
    Thought lo1 = Thought24.getInstance();
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, ab1);
}
    boolean lb2 = false;
    double ld3 = 743.63741680908;
    fd0 = fd1 + ld3;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1, fb1, lb0, lb2, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3);
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
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
        ad3 = ad4 - fd0;
    double ld1 = 557.6792628681044;
    Output.points[5][6] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
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
    double ld0 = 583.1273319259611;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought22.getInstance(fb0, fb1, ab1, ab2);
    fd1 = ld0 - ad1;
    ab3 = ad2 > ad3;
    ad4 *= -1;
    ab4 = !fb0;

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
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    Output.points[5][7] -= fd0;
    Thought lo1 = Thought374.getInstance(ao2, ao3, ao4, fo0);
    lb0 = fb0 && fb1;
    boolean lb2 = true;
    double ld3 = 521.6920169444888;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld3, fd0);
}
    double ld4 = 667.0809140010541;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ld4);
}
    lb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ld3 = ao2.m3(lb2, fb0, fb1, lb0);
}
    ld4 *= -1;
    fd0 = fd1 - ld3;
    ld4 = fd0 + fd1;
    lb2 = fb0 && fb1;
    lb0 = lb2 && fb0;
    ld3 = ld4 + fd0;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[5][8] -= fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
        double ld0 = 830.3959021696986;
        ad3 *= -1;
        Thought lo1 = Thought309.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
if(fo1 != null){
          ad1 = fo1.m3();
}
        fb1 = fb0 && fb1;
        boolean lb2 = false;
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
if(ao1 != null){
      fd0 = ao1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought231.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      ab2 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld1 = 906.7373245420303;
    Thought lo2 = Thought373.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);

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
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    Thought lo1 = Thought299.getInstance(lb0, ab1, ab2, ab3);
    double ld2 = 661.2948459477759;
    double ld3 = 125.04558834873708;
    double ld4 = 910.6014085106434;
    ab4 = fb0 || fb1;
    ad2 *= -1;
    boolean lb5 = false;
    Thought lo6 = Thought268.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, lb5, ab1, ab2);
    ld2 = ld3 + ld4;
    ab3 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, lb5, ab1, ab2, ab3);
}
    ab4 = !fb0;
    if (fb1) {
        lb0 = lb5 && ab1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    Thought lo0 = Thought127.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 575.8014062063529;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb2;

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
      ab1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[6][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 905.0982948944816;
    Thought lo1 = Thought247.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought6.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    Thought lo3 = Thought297.getInstance(fo0, fo1, fo0, fo1);
    ab3 = ab4 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    Output.points[6][1] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
    Thought lo3 = Thought330.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought355.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
    double ld5 = 147.72145477657492;
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb0;
    fd0 = fd1 - ld5;
    lb1 = ad1 < ad2;

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
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ad2 *= -1;
    ab1 = ab2 && ab3;
    double ld0 = 781.8381841690478;
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    boolean lb1 = false;
    Thought lo2 = Thought135.getInstance();
if(fo1 != null){
      fo1.m1(fb0, fb1, lb1, ab1);
}
    boolean lb3 = true;
    boolean lb4 = false;
    lb4 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = lb3 || lb4;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    ld0 *= -1;
    Output.points[6][2] += ad1;
    boolean lb5 = false;
    double ld6 = 518.4572000558634;
    fb0 = ad1 < ad2;
    fb1 = lb1 && lb3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Output.points[6][3] -= fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    lb0 = fd0 < fd1;
    Output.points[6][4] -= fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;

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
if(ao1 != null){
      ao1.m2();
}
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = ad4 < fd0;
    lb2 = !fb0;
    fb1 = fd1 < ad1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb0, lb1, lb2, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought165.getInstance(ao4, fo0, fo1, ao1);
    fd0 = fd1 + ad1;
    lb2 = ad2 < ad3;
    ad4 = fd0 + fd1;
    Thought lo4 = Thought295.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Output.points[6][5] += ad3;

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
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
    fd1 *= -1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 0.569093379679995;
    Thought lo1 = Thought399.getInstance(ao1, ao2, ao3, ao4);
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    ab4 = fb0 || fb1;
    double ld2 = 99.6005449339287;
    Thought lo3 = Thought6.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2);
    ad1 = ad2 - ad3;
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = ad4 > fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    fb1 = ld0 < ld2;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ld0, ld2, ab4, fb0, fb1, ab1);
}
    Output.points[6][6] += ad1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1();
}
    double ld0 = 447.3114643013062;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}

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
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    double ld1 = 996.1397425628908;
    Output.points[6][7] += fd0;
    boolean lb2 = true;
    ab3 = fd1 > ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        double ld3 = 413.93772870655044;
        lb2 = ab1 || ab2;
        double ld4 = 261.5387443693585;
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        ad2 = ad3 + ad4;
        fd0 *= -1;
        fb1 = !fb0;
        fb1 = fb0 || fb1;
        double ld0 = 479.32701262440133;
        fb0 = fd0 < fd1;
        fb1 = fb0 && fb1;
        Thought lo1 = Thought286.getInstance();
        fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
        fb0 = ld0 < ad1;
        ad2 *= -1;
        double ld2 = 983.1511274176308;
        Thought lo3 = Thought81.getInstance(fb1, fb0, fb1, fb0);
        boolean lb4 = true;
        ad2 *= -1;
        Thought lo5 = Thought296.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb4, fb0);
        Thought lo6 = Thought91.getInstance(ld0, ld2, ad1, ad2, fb1, lb4, fb0, fb1);
        boolean lb7 = true;
        lb4 = ad3 < ad4;
        lb7 = fd0 > fd1;
        fb0 = ld0 < ld2;
}
Thought.STACK_COUNTER++;
return ad3;
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
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 && ab2;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[6][8] -= fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[7][0] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd1 *= -1;
    lb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    double ld2 = 755.9118260306675;
if(ao3 != null){
      lb0 = ao3.m2(fd0, fd1, ld2, fd0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
    lb1 = ld2 > fd0;
    boolean lb3 = true;
if(ao3 != null){
      fd1 = ao3.m3();
}
    lb3 = ld2 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
    double ld4 = 758.7407821537977;

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
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    double ld2 = 162.83100798386167;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb1, lb3, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, ad1, ad2, lb0, lb1, lb3, fb0);
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
    ab1 = fd0 > fd1;
    double ld0 = 145.39608165276073;
if(ao1 != null){
      ao1.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld2 = 3.032839440444265;
if(ao1 != null){
      ld0 = ao1.m3(ld2, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0);
}
if(ao2 != null){
      ao2.m2();
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ld2 *= -1;
if(ao3 != null){
      ao3.m3(lb1, ab1, ab2, ab3);
}
        boolean lb3 = true;

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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    if (ab2) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m2(ad4, fd0, fd1, ad1);
}
        ab3 = ab4 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        fb1 = ab1 && ab2;
if(ao3 != null){
          ao3.m3();
}
if(fo0 != null){
          ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        if (fb0) {
            Thought lo0 = Thought344.getInstance(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
            boolean lb1 = false;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            ad2 = ad3 - ad4;
            lb1 = !ab1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Output.points[7][1] += fd1;
    double ld0 = 254.41066495331356;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought147.getInstance();
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;
if(fo0 != null){
          ab2 = fo0.m2();
}
        fd0 = fd1 - fd0;
        double ld2 = 299.37981567214945;
if(fo1 != null){
          ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(ld2, fd0, fd1, ld2, lb0, lb1, ab1, ab2);
}
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought321.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m3(fd1, ld2, fd0, fd1);
}
        lb0 = ld2 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
        Thought lo4 = Thought224.getInstance();
        ld2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
        ab4 = fd0 < fd1;
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
    Thought lo0 = Thought235.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought321.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    double ld2 = 124.06262822736099;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, ad1);
}
        ad2 *= -1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ld2 = ad1 + ad2;
        fb1 = ad3 < ad4;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m3();
}
}}
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
    ab1 = !ab2;
    ab3 = ad2 < ad3;
    ab4 = ad4 < fd0;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    ab3 = ab4 || fb0;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 769.9186445041458;
    boolean lb1 = false;
    Output.points[7][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;

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
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fd1 *= -1;
    Thought lo0 = Thought190.getInstance();
    double ld1 = 278.1363016574396;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought371.getInstance(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[7][3] -= fd0;
    double ld3 = 954.1777076069861;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(fd1, ld1, ld3, fd0);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, ld3, fd0);
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
    fb1 = ad2 < ad3;
    if (fb0) {
        fb1 = fb0 || fb1;
if(ao1 != null){
          ad4 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        double ld0 = 21.13034113089371;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        } else if (fb0) {
        Thought lo1 = Thought303.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
        ad1 *= -1;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
        } else if (fb0) {
        Thought lo2 = Thought131.getInstance(ad2, ad3, ad4, fd0);
        Output.points[7][4] += fd1;
        Thought lo3 = Thought172.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ao1.m2(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fd0 = fd1 + ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
        Thought lo4 = Thought158.getInstance(ao4, fo0, fo1, ao1);
        for(int i0=0; i0<10; i0++){
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
    Thought lo0 = Thought325.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    Output.points[7][5] -= fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb2 = true;
    lb1 = !lb2;
    fd0 = fd1 + fd0;
    double ld3 = 796.680787998719;
    Thought lo4 = Thought114.getInstance(ab1, ab2, ab3, ab4);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0, fb0, fb1, lb1, lb2);
}
    ab1 = ab2 && ab3;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    boolean lb5 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought152.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab2 = ad3 > ad4;
    Thought lo1 = Thought274.getInstance();
    Thought lo2 = Thought354.getInstance(ab3, ab4, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought280.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[7][6] += ad4;

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
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought64.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought84.getInstance();
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    fd0 *= -1;
    boolean lb3 = true;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[7][7] += fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fd1 = fd0 - fd1;
        Thought lo1 = Thought208.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    fd0 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld4 = 669.1585986221224;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld4, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4);
}
    lb2 = fd0 < fd1;

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
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought42.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fb0 = fd1 < fd0;
    Output.points[7][8] += fd1;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 && fb1;
    Thought lo2 = Thought152.getInstance(fd1, fd0, fd1, fd0);

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
