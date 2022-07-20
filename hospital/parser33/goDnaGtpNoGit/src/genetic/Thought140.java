package genetic;
import java.util.ArrayList;
class Thought140 extends Thought{
private static ArrayList<Thought140> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 225.1237403292584;
private double fd1 = 195.14648530077392;
private Thought fo0 = null;
private Thought fo1 = null;
Thought140 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought140 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought140 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought140 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought140 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought140 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought140 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought140 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought140 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought140 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought140 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought140 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought140 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought140 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought140 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought140 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought140 instance = new Thought140 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[2][1] -= fd0;
    Thought lo0 = Thought38.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[2][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 534.9180057728298;
    ld2 *= -1;
if(fo0 != null){
          lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    double ld3 = 780.7847984314017;
    ld3 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(ld3, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    ld3 = fd0 - fd1;
    boolean lb4 = false;
    lb4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, fd0, fd1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought103.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        lb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          ab1 = fo0.m2();
}
        ab2 = fd1 > fd0;
if(fo1 != null){
          fo1.m2(ab3, ab4, fb0, fb1);
}
        boolean lb2 = true;
        Output.points[2][3] -= fd1;
        Thought lo3 = Thought104.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, lb1, ab1, ab2);
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
    Thought lo0 = Thought253.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    double ld1 = 600.8405176361761;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought206.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld1);
}
    lb2 = fb0 || fb1;
    Thought lo4 = Thought167.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    double ld5 = 948.3632094444393;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
    Output.points[2][4] -= ld5;
    fb1 = ad1 < ad2;
if(fo0 != null){
      lb2 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Thought lo6 = Thought58.getInstance(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
    Thought lo7 = Thought359.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(ld1, ld5, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    boolean lb8 = true;
if(fo1 != null){
      fo1.m3();
}
    boolean lb9 = true;
    Output.points[2][5] -= ld5;
if(fo0 != null){
      fo0.m2(lb8, lb9, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb8, lb9, fb0, fb1);
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
    Thought lo0 = Thought336.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 - ad1;
    fb0 = fb1 && ab1;
    ab2 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    double ld1 = 250.8905290376825;
    ab3 = ad1 > ad2;
    Thought lo2 = Thought112.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && ab1;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    Output.points[2][6] += ld1;
    Thought lo3 = Thought30.getInstance(ad1, ad2, ad3, ad4);
    boolean lb4 = false;
    Output.points[2][7] -= fd0;

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
    fb1 = !fb0;
        fb1 = !fb0;
    fd0 *= -1;
    double ld0 = 136.99709713422584;
    Output.points[2][8] += fd0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fd1 < ld0;
    fb1 = fb0 || fb1;
    double ld1 = 496.50609003878725;
    fb0 = fb1 && fb0;
    fb1 = ld1 > fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = ad2 > ad3;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          lb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao2.m3();
}
if(ao3 != null){
          ad4 = ao3.m3(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        lb0 = fb0 && fb1;
if(ao3 != null){
          ao3.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fb1 = ad1 > ad2;
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
        }
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    lb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
    Thought lo1 = Thought189.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    lb0 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    if (fb0) {
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        fd0 *= -1;
        double ld0 = 888.4448456186319;
        ab2 = ab3 || ab4;
        } else if (fb0) {
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
        fd1 = fd0 + fd1;
        fd0 *= -1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        Thought lo3 = Thought9.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
if(ao2 != null){
          fd1 = ao2.m3();
}
        Output.points[3][0] += fd0;
if(ao4 != null){
          ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
        Thought lo4 = Thought395.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb1, lb2, ab1);
        fd1 = fd0 - fd1;
        fd0 *= -1;
        ab2 = ab3 && ab4;
        if (fb0) {
if(ao4 != null){
              ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb2, ab1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[3][1] += ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    double ld0 = 850.0399449660872;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    ab1 = ad3 < ad4;
if(ao2 != null){
      ab2 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought241.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought371.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought51.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);

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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    double ld0 = 225.96198240051285;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ld0;
    fb1 = fd0 > fd1;
    fb0 = ld0 > fd0;
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo1 = Thought276.getInstance(fo1, fo0, fo1, fo0);

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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    double ld1 = 444.048319901884;
    double ld2 = 801.7507526429695;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld1);
}
        Thought lo3 = Thought395.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
    ld2 = fd0 + fd1;
    Thought lo4 = Thought138.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ld1, ld2, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld1 = ld2 - fd0;
    Output.points[3][2] -= fd1;
    double ld5 = 878.0985483841769;
    Output.points[3][3] -= ld1;
    fb1 = !lb0;
    ab1 = ld2 < ld5;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ld2);
}
    ld5 *= -1;

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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought81.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        for(int i0=0; i0<10; i0++){
        double ld0 = 121.827302686789;
        ld0 *= -1;
if(fo1 != null){
          ad1 = fo1.m3();
}
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought399.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
        fd1 = ld0 + ad1;
        Thought lo2 = Thought284.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
        ab2 = fd1 > ld0;
        ad1 = ad2 + ad3;
        Thought lo3 = Thought388.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
        ab1 = ab2 && ab3;
        Output.points[3][4] += ad4;
        boolean lb4 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
        boolean lb5 = true;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        boolean lb6 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab1 = ab2 || ab3;
        boolean lb7 = true;
        ab3 = !ab4;
        Output.points[3][5] -= fd1;
        boolean lb8 = true;
        Thought lo9 = Thought2.getInstance(ab4, fb0, fb1, lb4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] += fd0;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    boolean lb1 = true;
    boolean lb2 = true;
    lb0 = fd1 > fd0;
    lb1 = lb2 && fb0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    if (fb1) {
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        lb0 = lb1 || lb2;
        double ld3 = 292.11156652909915;
        fb0 = fb1 && lb0;
if(ao3 != null){
          ao2 = ao3.m4();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought206.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld1 = 166.64371726481383;
    ad3 = ad4 - fd0;
    fb1 = fd1 < ld1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fd1 = ld1 - ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Thought lo2 = Thought293.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
if(ao1 != null){
      ao1.m3();
}
    Thought lo3 = Thought176.getInstance(fb1, fb0, fb1, fb0);
    Thought lo4 = Thought246.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
    Output.points[3][7] += fd1;
    ld1 *= -1;
    Thought lo5 = Thought46.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = ad1 < ad2;
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    double ld0 = 558.1520069329521;
    ld0 *= -1;
    ab1 = fd0 < fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought251.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
        ab1 = ab2 && ab3;
    fd1 = ld0 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld0 = fd0 + fd1;
    ab4 = fb0 && fb1;
    lb1 = ab1 || ab2;
if(ao4 != null){
      ao4.m3(ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
    double ld3 = 927.1879738816477;
    ld0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    Output.points[3][8] -= ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
        Output.points[4][0] += ad4;
    Output.points[4][1] += fd0;
    lb0 = fd1 > ad1;
    double ld1 = 405.76151787149917;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought394.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        boolean lb1 = false;
    Thought lo2 = Thought89.getInstance();
    double ld3 = 392.26627620872404;
    ld3 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought187.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + fd0;
    fb0 = fb1 || ab1;
    double ld1 = 684.7704773615152;
    ab2 = fd0 > fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ld1 < fd0;
        fd1 = ld1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 && lb2;
        Output.points[4][2] += ld1;
        ab1 = !ab2;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld1, fd0);
}
        boolean lb3 = false;
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        ld1 = fd0 - fd1;
        ab1 = ld1 < fd0;
        fd1 = ld1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[4][3] += fd1;
        ld1 *= -1;
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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought31.getInstance(fo1, fo0, fo1, fo0);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 *= -1;
    Thought lo0 = Thought5.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      ab4 = fo1.m2();
}
    Thought lo1 = Thought288.getInstance(fb0, fb1, ab1, ab2);
    boolean lb2 = false;
    ab2 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
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
        boolean lb0 = true;
    fd0 = fd1 + fd0;
if(ao1 != null){
      lb0 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    fd1 *= -1;
    boolean lb1 = true;
if(ao1 != null){
          lb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    Output.points[4][4] -= fd0;
    fd1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
    boolean lb2 = true;
    Thought lo3 = Thought262.getInstance(lb0, lb1, lb2, fb0);
    fb1 = lb0 && lb1;

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
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought364.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    lb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
    ad3 *= -1;
    boolean lb2 = true;
    fb0 = !fb1;

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
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    Output.points[4][5] -= fd0;
    double ld0 = 731.3089277797671;
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    Thought lo2 = Thought90.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo3 = Thought395.getInstance(ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
    Thought lo4 = Thought296.getInstance(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
    boolean lb5 = false;
    ab2 = ab3 || ab4;
    double ld6 = 133.57947391206886;
    boolean lb7 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 = fd1 + ld0;
    double ld8 = 848.9167051981843;

Thought.STACK_COUNTER++;
return ld6;
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
    ab2 = ab3 && ab4;
    fb0 = ad3 < ad4;
    double ld0 = 981.8465588835996;
if(ao2 != null){
      fb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    boolean lb2 = true;
        ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld3 = 73.95132616219216;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    lb1 = lb2 && ab1;
    ab2 = ld0 > ld3;
    ab3 = ad1 > ad2;
    double ld4 = 656.1525615419041;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo5 = Thought127.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
    Thought lo6 = Thought297.getInstance(fo0, fo1, ao1, ao2, ld0, ld3, ld4, ad1);
    ad2 = ad3 + ad4;

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
    double ld0 = 112.34717169476801;
    Output.points[4][6] -= ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    double ld2 = 23.78779914215988;
    Output.points[4][7] -= ld0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    Output.points[4][8] -= fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[5][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = fd0 > fd1;
    Output.points[5][1] -= fd0;
    Thought lo0 = Thought25.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought360.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    Output.points[5][2] += ad1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    fd0 = fd1 - ad1;
if(fo0 != null){
          ad2 = fo0.m3(lb0, lb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    if (lb0) {
        Output.points[5][3] += ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
        ad3 = ad4 - fd0;
        lb1 = fd1 < ad1;
        fb0 = !fb1;
        lb0 = lb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
        fd1 = ad1 + ad2;
        boolean lb2 = true;
        ad3 = ad4 + fd0;
        fb0 = fd1 < ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb3 = false;
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld0 = 359.81828943943117;
    Thought lo1 = Thought314.getInstance();
    boolean lb2 = true;
    lb2 = ad3 > ad4;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, lb2, lb3, lb4, ab1);
}
    ab2 = ad2 < ad3;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, lb4, lb5);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Thought lo6 = Thought218.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    ab1 = ad2 > ad3;
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb4, lb5, lb7, ab1);
}
    ab2 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb2 = lb3 || lb4;

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
      ao2.m1(ao3, ao4, fo0, fo1);
}
    double ld0 = 381.594683033288;
    fb1 = fd0 < fd1;
    fb0 = ld0 < fd0;
if(ao1 != null){
      ao1.m3(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought364.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought107.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Thought lo3 = Thought240.getInstance(fo1, ao1, ao2, ao3);
    Output.points[5][4] += ld0;
    fb1 = fb0 || fb1;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Output.points[5][5] += ad1;
        fb0 = fb1 && lb0;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought191.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = ad1 > ad2;
    fb0 = !fb1;
    Output.points[5][6] -= ad3;
    lb0 = fb0 && fb1;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    ad3 *= -1;
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    Thought lo2 = Thought304.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = !ab1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Output.points[5][7] -= fd1;
        boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    Output.points[5][8] -= fd1;
    boolean lb2 = true;
    double ld3 = 339.5817071957815;
    lb2 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(ao4 != null){
      fb1 = ao4.m2(lb0, lb1, lb2, ab1);
}
    ab2 = ab3 && ab4;
    ld3 *= -1;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = ld3 - fd0;
    fd1 *= -1;
    Output.points[6][0] += ld3;
    lb2 = fd0 > fd1;
    ab1 = ld3 > fd0;

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
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    fb0 = ad2 > ad3;
    fb1 = lb0 && ab1;
    ab2 = ad4 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
    lb0 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;

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
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought317.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld1 = 342.83449976388954;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
            Output.points[6][1] += ld1;
    fd0 = fd1 - ld1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    fb0 = fd1 < ld1;
    fd0 = fd1 + ld1;
    double ld3 = 297.05711929994095;
    fb1 = ld3 < fd0;
    fd1 = ld1 - ld3;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ld3, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought384.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld3);
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
    fb0 = fd0 > fd1;
    Output.points[6][2] -= fd0;
    Thought lo0 = Thought199.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;
    fd1 = fd0 - fd1;
    lb1 = lb2 && lb3;
    double ld4 = 367.59901106893733;
    fb0 = fb1 && lb1;
    ld4 *= -1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fd1, ld4, fd0, fd1, lb3, fb0, fb1, lb1);
}
    ld4 = fd0 + fd1;
    lb2 = !lb3;
    Thought lo5 = Thought94.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
    ld4 = fd0 - fd1;
    lb3 = fb0 || fb1;
    ld4 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = ld4 > fd0;
if(fo1 != null){
      fo1.m2(fd1, ld4, fd0, fd1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    fd1 *= -1;
    Output.points[6][3] += fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought160.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought156.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought144.getInstance(fd0, fd1, fd0, fd1);

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
