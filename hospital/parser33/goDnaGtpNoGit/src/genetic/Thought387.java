package genetic;
import java.util.ArrayList;
class Thought387 extends Thought{
private static ArrayList<Thought387> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 681.307970457129;
private double fd1 = 941.9380255343015;
private Thought fo0 = null;
private Thought fo1 = null;
Thought387 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought387 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought387 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought387 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought387 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought387 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought387 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought387 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought387 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought387 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought387 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought387 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought387 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought387 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought387 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought387 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought387 instance = new Thought387 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought47.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Output.points[8][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][6] += fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought378.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        boolean lb3 = true;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb3, lb1);
}
        fb0 = fb1 && lb3;
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = fd0 > fd1;
        fd0 *= -1;
        fb1 = !lb3;
        lb1 = fb0 || fb1;
        lb3 = fd1 < fd0;
        double ld4 = 428.8332385860813;
        fd0 = fd1 - ld4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld4, fd0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
        ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
    ab3 = !ab4;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo1 = Thought323.getInstance(fb0, fb1, lb0, ab1);
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    boolean lb2 = false;
    double ld3 = 205.61212732169176;
    double ld4 = 152.28363754402852;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld3 = ld4 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb2, ab1);
}
    Thought lo5 = Thought303.getInstance(fo1, fo0, fo1, fo0);
    ab2 = fd1 > ld3;

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
    ad2 *= -1;
    boolean lb0 = false;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    if (lb0) {
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Thought lo2 = Thought110.getInstance();
        fb0 = fd0 < fd1;
        fb1 = lb0 || lb1;
        boolean lb3 = true;
if(fo1 != null){
          fo1.m2(lb1, fb0, fb1, lb3);
}
        Output.points[8][7] += ad1;
        lb0 = !lb1;
        fb0 = ad2 > ad3;
        ad4 = fd0 - fd1;
        ad1 *= -1;
        ad2 = ad3 + ad4;
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[8][8] += ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fb1 = lb0 || ab1;
    double ld1 = 52.5248396361077;
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    ab1 = fd1 > ld1;
    if (ab2) {
        double ld2 = 783.7754401595729;
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
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought76.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought163.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld2 = 496.31524886954327;
    ld2 = fd0 + fd1;
    ld2 *= -1;
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    double ld3 = 166.7254330628719;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ld2 = ao2.m3(ld3, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        ld3 *= -1;
        fd0 = fd1 - ld2;
        fb1 = fb0 && fb1;
        fb0 = ld3 < fd0;
        fd1 = ld2 - ld3;
        Thought lo4 = Thought249.getInstance(ao3, ao4, fo0, fo1);
        fb1 = fd0 > fd1;
        fb0 = ld2 < ld3;
        Thought lo5 = Thought375.getInstance(fd0, fd1, ld2, ld3);
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
    Thought lo0 = Thought114.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
        fb1 = fb0 && fb1;
    Thought lo1 = Thought305.getInstance();
    fb0 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld2 = 882.065218363236;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 || ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        Output.points[0][0] -= fd0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ab3 = ab4 || fb0;
        fd1 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
        }
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
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
    double ld0 = 746.4044300978048;
if(ao1 != null){
      ad1 = ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ab3 = fd1 < ld0;
    ab4 = ad1 < ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ld0 = ad1 - ad2;
    ad3 = ad4 + fd0;
    Thought lo2 = Thought152.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
    fb1 = fd1 < ld0;
    boolean lb3 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    Thought lo5 = Thought113.getInstance(ad4, fd0, fd1, ld0);
        double ld6 = 127.78113112290885;
    ld6 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        lb1 = lb3 || lb4;
        boolean lb7 = false;
        ad3 = ad4 - fd0;
        lb4 = ab1 || ab2;
        }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld6, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    if (ab4) {
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
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo0 = Thought296.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    Output.points[0][1] += fd1;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;

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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    boolean lb0 = true;
    Output.points[0][2] += fd0;
    double ld1 = 939.2376240187966;
    Output.points[0][3] += fd0;
    boolean lb2 = true;
    lb2 = ab1 || ab2;
    ab3 = ab4 && fb0;
    fb1 = fd1 > ld1;
    lb0 = lb2 && ab1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    boolean lb3 = false;
    boolean lb4 = true;
    fd1 *= -1;
    ab4 = fb0 || fb1;
    lb0 = lb2 && lb3;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    Output.points[0][4] -= ad2;
    ad3 = ad4 - fd0;
    fb1 = fb0 && fb1;
    Output.points[0][5] += fd1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + ad1;
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    Output.points[0][6] -= ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    if (lb0) {
        fd0 = fd1 + fd0;
if(ao4 != null){
          ao4.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Thought lo2 = Thought63.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fd0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(lb1, fb0, fb1, lb0);
}
        lb1 = fb0 || fb1;
        lb0 = lb1 || fb0;
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
    Output.points[0][7] -= ad2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fb0 = ad3 > ad4;
        fd0 = fd1 - ad1;
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
        Thought lo0 = Thought186.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
        fd0 = fd1 - ad1;
if(fo0 != null){
          fb1 = fo0.m2();
}
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        Output.points[0][8] += ad2;
        lb1 = fb0 || fb1;
        boolean lb2 = false;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
        lb1 = ad1 > ad2;
        }
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
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
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    ab1 = !ab2;
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fd0 *= -1;
    boolean lb0 = true;

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
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought142.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
        fb1 = !ab1;
    ad2 = ad3 + ad4;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1();
}
    boolean lb2 = false;
    Output.points[1][0] -= ad3;
    ab3 = !ab4;
    Thought lo3 = Thought243.getInstance(fb0, fb1, lb1, lb2);
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb1, lb2, ab1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
}
    double ld4 = 471.26371790973707;
    ab1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld5 = 631.1817560219539;
    ab2 = ld4 < ld5;
    boolean lb6 = false;
    ab2 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[1][1] += ld4;
    ld5 *= -1;

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
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Output.points[1][2] -= fd1;
    if (fb1) {
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    Output.points[1][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought241.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    Output.points[1][4] -= fd0;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = fd0 < fd1;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    boolean lb1 = false;
    Output.points[1][5] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    fb1 = lb0 || lb1;
        Thought lo2 = Thought222.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
    lb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb3 = ad4 > fd0;
    boolean lb4 = true;
    lb4 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
if(fo0 != null){
          ad4 = fo0.m3(lb0, lb1, lb3, lb4);
}
    boolean lb5 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb0 = false;
    ad4 = fd0 + fd1;
    lb0 = ad1 > ad2;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 614.2468211343042;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld3;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    boolean lb4 = true;
    Thought lo5 = Thought164.getInstance(fo1, fo0, fo1, fo0);
    ab3 = !ab4;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld3, ad1, ad2);
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
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[1][6] -= fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + fd0;
    Output.points[1][7] -= fd1;
    fb1 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought384.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
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
    double ld0 = 479.31055320912037;
    boolean lb1 = true;
    lb1 = ad1 < ad2;
    double ld2 = 20.296976471841543;
    fb0 = fb1 || lb1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[1][8] += ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3);
}
    fb1 = lb1 || fb0;
    fb1 = !lb1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = !lb1;
    ad4 = fd0 - fd1;
    fb0 = ld0 < ld2;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    ld2 = ad1 - ad2;
    Thought lo3 = Thought377.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
    Thought lo4 = Thought71.getInstance(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = fd1 > fd0;
    Output.points[2][0] -= fd1;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
    fd1 *= -1;

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
    ab1 = !ab2;
    double ld0 = 160.5703327032213;
    Output.points[2][1] -= ad1;
    ab3 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld1 = 651.3955887533119;
    Output.points[2][2] += fd0;
    double ld2 = 82.16635503387442;
    fd0 = fd1 + ld0;
    boolean lb3 = false;
    ab1 = !ab2;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = true;
    Output.points[2][3] -= fd0;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    lb1 = !lb2;
    double ld3 = 905.2836622642552;
    fb0 = ld3 > fd0;
    fb1 = fd1 < ld3;
if(fo0 != null){
      lb0 = fo0.m2(lb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought230.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb0, lb1, lb2, fb0);
    Output.points[2][4] += fd1;
    fb1 = ld3 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, fd0, fd1, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    Thought lo5 = Thought88.getInstance(fo1, fo0, fo1, fo0);

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
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    double ld1 = 847.7417937873689;
    fd0 *= -1;
    ab1 = !ab2;
    Thought lo2 = Thought81.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    Thought lo3 = Thought192.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
    fd1 = ld1 + fd0;
    fb1 = fd1 < ld1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Output.points[2][5] -= ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
    boolean lb4 = true;
    Thought lo5 = Thought105.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    Output.points[2][6] -= ld1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, fd0, fd1);
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
    if (fb1) {
        Output.points[2][7] += ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m3();
}
        fb0 = fd1 < ad1;
        for(int i0=0; i0<10; i0++){
            boolean lb0 = false;
if(fo1 != null){
              fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
            fb1 = ad2 > ad3;
            boolean lb1 = true;
            lb0 = ad4 > fd0;
            boolean lb2 = true;
            Thought lo3 = Thought166.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
            ad4 *= -1;
            for(int i1=0; i1<10; i1++){
                fd0 = fd1 - ad1;
}}}
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
      fo1.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      lb0 = fo1.m2(ad3, ad4, fd0, fd1);
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
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought134.getInstance();
    Output.points[2][8] += fd1;
    Output.points[3][0] -= fd0;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao1 != null){
      ao1.m2(lb0, lb2, lb3, fb0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    lb0 = lb2 || lb3;
        fb0 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    Thought lo0 = Thought55.getInstance(fd0, fd1, ad1, ad2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    Output.points[3][1] += ad1;
    double ld1 = 745.091702643257;
    fb0 = fb1 || fb0;

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
    fd1 *= -1;
    double ld0 = 82.71196024650436;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought321.getInstance(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao3.m2(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[3][2] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    double ld2 = 389.7915076838942;
    ld0 *= -1;
    fb1 = ld2 < fd0;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld2, fd0);
}
    ab2 = fd1 < ld0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    double ld0 = 396.32103748885777;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    ab3 = ad3 > ad4;
    Thought lo3 = Thought141.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld4 = 119.86993377992971;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, lb1);
}
    double ld5 = 926.6013329734691;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld5, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    double ld6 = 623.2328501112454;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(ao4 != null){
      ld4 = ao4.m3(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
    boolean lb7 = true;
    Thought lo8 = Thought181.getInstance(ao3, ao4, fo0, fo1);
    ab3 = !ab4;
    fb0 = ld5 > ld6;

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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    boolean lb1 = false;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
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
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    double ld0 = 283.96217685821;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3();
}
    Thought lo1 = Thought272.getInstance(fb0, fb1, fb0, fb1);

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
    lb0 = !fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    boolean lb2 = true;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb2 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    fb0 = !fb1;

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
