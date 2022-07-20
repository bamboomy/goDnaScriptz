package genetic;
import java.util.ArrayList;
class Thought18 extends Thought{
private static ArrayList<Thought18> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 131.69231166727914;
private double fd1 = 737.0760558829928;
private Thought fo0 = null;
private Thought fo1 = null;
Thought18 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought18 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought18 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought18 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought18 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    double ld1 = 378.26428173591404;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    boolean lb2 = true;
    double ld3 = 172.21476176339254;
    fb0 = ld3 > fd0;
    fd1 = ld1 + ld3;
    fb1 = lb0 && lb2;
    fd0 = fd1 - ld1;
    Output.points[0][8] -= ld3;
    double ld4 = 755.0293135764089;
    fb0 = !fb1;
    Output.points[1][0] += ld4;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
}
    Output.points[1][1] -= ld4;

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
    fd1 *= -1;
    boolean lb1 = false;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought120.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought251.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    double ld4 = 412.9717729884533;
    Thought lo5 = Thought6.getInstance(fo1, fo0, fo1, fo0);
    ld4 = fd0 - fd1;
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1);
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    double ld1 = 336.2703074034836;
    Thought lo2 = Thought205.getInstance(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[1][2] -= ad2;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    Output.points[1][3] -= ad3;
    lb3 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ad1, ad2, ad3);
}
    if (fb0) {
        Thought lo4 = Thought316.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
        fb1 = !lb0;
        Output.points[1][4] += ad1;
        Thought lo5 = Thought89.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(lb3, fb0, fb1, lb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb0 = false;
    Thought lo1 = Thought224.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    fb1 = ad3 < ad4;
    Thought lo2 = Thought349.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
    double ld0 = 461.49689179776743;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = fb0 || fb1;
    lb1 = !fb0;
if(ao4 != null){
      ao4.m2(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      fd1 = ao4.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought229.getInstance(ao4, fo0, fo1, ao1);
    lb1 = !fb0;
    double ld3 = 105.83924983597376;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ld3);
}
    fb1 = lb1 || fb0;
    Thought lo4 = Thought52.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld3);
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb5 = true;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 *= -1;
    lb1 = !lb5;
    fb0 = !fb1;
    lb1 = ld0 > ld3;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(lb5, fb0, fb1, lb1);
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
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd0 < fd1;
        lb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought173.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fb1 = ad2 > ad3;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb1 = fb0 && fb1;
    Thought lo3 = Thought307.getInstance(ad4, fd0, fd1, ad1);
    lb0 = ad2 < ad3;
    lb1 = fb0 && fb1;

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
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    boolean lb0 = true;
    fd0 *= -1;
    ab1 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
if(ao1 != null){
      ab3 = ao1.m2();
}
    ab4 = fb0 || fb1;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao2.m2(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought360.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[1][5] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    lb2 = fd0 < fd1;
    double ld3 = 759.039814135192;
    ab1 = ld3 > fd0;
    boolean lb4 = true;
    double ld5 = 641.5288914897396;

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
    ab2 = !ab3;
    double ld0 = 383.41372917193297;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ld0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
    boolean lb2 = false;
    double ld3 = 870.9642116030928;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3);
}
    Thought lo4 = Thought211.getInstance();
    ab1 = !ab2;
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld0, ld3, ad1, ad2, lb2, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao4.m1(fd1, ld0, ld3, ad1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][6] += fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought40.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    double ld1 = 53.428480181003835;
    fb0 = fb1 || fb0;
    Thought lo2 = Thought372.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought40.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    fd0 *= -1;
    Thought lo2 = Thought220.getInstance();
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fb1, lb1, ab1, ab2);
}
    if (ab3) {
        ab4 = fb0 && fb1;
        } else if (lb1) {
        Thought lo3 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        fd0 = fd1 - fd0;
        double ld4 = 109.94883059373109;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld4, fd0, fb1, lb1, ab1, ab2);
}
        fd1 *= -1;
        ab3 = ab4 || fb0;
        ld4 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
        fd0 *= -1;
        Thought lo5 = Thought176.getInstance(fo0, fo1, fo0, fo1);
}
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
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
        fb0 = !fb1;
    Thought lo0 = Thought272.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    fb0 = ad3 < ad4;
    Thought lo1 = Thought71.getInstance();
    double ld2 = 225.0541404801075;
    ad4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought57.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld2 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][7] += ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld2, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;

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
    ab2 = !ab3;
    ab4 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    Thought lo0 = Thought177.getInstance();
if(fo0 != null){
          fo0.m1(fb0, fb1, ab1, ab2);
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        if (fb0) {
            Output.points[1][8] -= fd0;
            fb1 = ab1 || ab2;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
            double ld1 = 400.446990369247;
            Output.points[2][0] += fd0;
            boolean lb2 = false;
            lb2 = ab1 && ab2;
            fd1 = ld1 + ad1;
            boolean lb3 = false;
            boolean lb4 = true;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 372.180706239134;
    fb1 = fd0 > fd1;
    fb0 = ld0 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
    fb1 = !fb0;
    ad1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo0 = Thought8.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = false;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    lb1 = fd1 > ad1;
    Thought lo2 = Thought73.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
    fb0 = fb1 && lb1;
    Output.points[2][1] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought51.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
    ad2 *= -1;
if(ao4 != null){
      ao4.m3(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    ad1 = ad2 - ad3;
    boolean lb4 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
    double ld0 = 420.960818482275;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = fd1 > ld0;
    double ld1 = 200.4325896383561;
    boolean lb2 = true;
    ab2 = ld1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld1, fd0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb2);
}
    fd1 = ld0 - ld1;
    Thought lo3 = Thought321.getInstance(fo0, fo1, ao1, ao2);
    Thought lo4 = Thought348.getInstance(fd0, fd1, ld0, ld1);
    fd0 = fd1 + ld0;
    double ld5 = 83.48584650325503;
    ld1 = ld5 - fd0;
    ab1 = ab2 && ab3;
    Thought lo6 = Thought346.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ld5);
    fd0 *= -1;

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
    boolean lb0 = false;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    boolean lb2 = true;
    double ld3 = 518.2651290191932;
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ad1 *= -1;
    ad2 = ad3 - ad4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[2][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
    fd0 *= -1;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][3] -= fd1;

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
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    ab4 = fd1 > fd0;
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    if (fb0) {
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
            ad4 *= -1;
            fd0 = fd1 - ad1;
            boolean lb0 = true;
            fb0 = fb1 && lb0;
            if (fb0) {
                fb1 = lb0 && fb0;
                Output.points[2][4] += ad2;
                double ld1 = 951.2078240587487;
                fb1 = ad2 > ad3;
                double ld2 = 619.1553892572314;
                double ld3 = 576.8104296621041;
                ad2 *= -1;
                } else {
                lb0 = !fb0;
                                fb1 = fd1 < ad1;
if(fo0 != null){
                  lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
                ad2 = ad3 - ad4;
                fd0 = fd1 - ad1;
                ad2 *= -1;
                ad3 *= -1;
if(fo1 != null){
                  fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
}}}
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
    double ld0 = 879.6841846403215;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    double ld1 = 820.899627519679;
    fb1 = ab1 && ab2;
    ad3 = ad4 - fd0;
    boolean lb2 = false;
    Output.points[2][5] -= fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = true;
    ab3 = ab4 || fb0;
    ld1 *= -1;
    Output.points[2][6] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    double ld0 = 704.2569685250087;
    ld0 = fd0 - fd1;
    Output.points[2][7] -= ld0;
if(ao1 != null){
      ao1.m2();
}
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(ao4 != null){
      fb0 = ao4.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    double ld2 = 880.2334426756863;
    Thought lo3 = Thought158.getInstance(fo0, fo1, ao1, ao2);
        boolean lb4 = false;
if(ao3 != null){
      ao3.m3(ld2, fd0, fd1, ld0);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 848.0591802255715;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
if(ao2 != null){
          fb1 = ao2.m2();
}
    ad4 = fd0 + fd1;
    fb0 = ld0 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Output.points[2][8] -= ad2;
    fb0 = fb1 || lb1;
    fb0 = !fb1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought184.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(ao1 != null){
      ao1.m1();
}
    double ld1 = 847.0004664530164;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought278.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
    boolean lb1 = false;
if(ao1 != null){
      ad2 = ao1.m3();
}
    ad3 = ad4 - fd0;
    lb1 = ab1 || ab2;
    double ld2 = 152.38289757415131;
    Output.points[3][0] -= fd0;
    double ld3 = 697.7799715717915;

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
    Thought lo0 = Thought358.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought107.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo4 = Thought121.getInstance(fb1, lb1, lb2, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, lb2, fb0);
}
    double ld5 = 501.5041053108703;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m1(ld5, fd0, fd1, ld5, fb0, fb1, lb1, lb2);
}
    boolean lb7 = true;
    double ld8 = 816.2595286844036;
    lb6 = ld8 > fd0;
    Output.points[3][1] += fd1;
    boolean lb9 = true;
    Thought lo10 = Thought151.getInstance(fo1, fo0, fo1, fo0, lb7, lb9, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    double ld0 = 926.9565964126639;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    ab2 = !ab3;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        Output.points[3][2] += ld0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
        double ld2 = 378.5430686851717;
        boolean lb3 = false;
        ab3 = ab4 && fb0;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb3, lb1, ab1);
}
        fd1 = ld2 + ld0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb4 = true;
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
    Output.points[3][3] += ad1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
        boolean lb1 = false;
        ad2 = ad3 + ad4;
        }
    if (fb0) {
        double ld2 = 361.44165304638045;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
        boolean lb3 = false;
        Output.points[3][4] += ad1;
        boolean lb4 = true;
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab1 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 < ad2;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought170.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    ad3 = ad4 - fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[3][5] -= fd1;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
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
    Thought lo0 = Thought387.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb1 = true;
if(ao1 != null){
      lb1 = ao1.m2(fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    lb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
}
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb2, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb1 = ao3.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
    lb1 = !lb2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought246.getInstance(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb1);

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[3][6] += ad1;
    fb1 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 = fd0 + fd1;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought2.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    fb1 = !fb0;
    Thought lo1 = Thought345.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought181.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fb0 || fb1;
    fd0 = fd1 + ad1;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    lb3 = fd1 < ad1;

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
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2();
}
    Output.points[3][7] += fd0;
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
    fb0 = fb1 && lb0;
    boolean lb2 = true;
if(ao1 != null){
      fd1 = ao1.m3(lb1, lb2, ab1, ab2);
}
    boolean lb3 = false;
    fd0 = fd1 + fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 642.0262256757378;
    fd0 = fd1 + ld0;
    double ld1 = 606.8219536922009;
    ld1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    double ld2 = 331.63969972247935;
    ab2 = ab3 || ab4;
    fb0 = ld0 > ld1;
    boolean lb3 = false;
    fb0 = fb1 && lb3;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab1 = !ab2;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = false;
    Output.points[3][8] += fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1();
}
    boolean lb2 = false;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    Thought lo4 = Thought241.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Thought lo5 = Thought242.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, lb2, lb3);
}
    fd1 = fd0 + fd1;
    Thought lo6 = Thought377.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
        lb2 = fd0 > fd1;
    lb3 = fd0 > fd1;

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
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    Output.points[4][0] += fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought48.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought241.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought296.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb3 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
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
