package genetic;
import java.util.ArrayList;
class Thought170 extends Thought{
private static ArrayList<Thought170> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 428.04728482581964;
private double fd1 = 813.5869208819497;
private Thought fo0 = null;
private Thought fo1 = null;
Thought170 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought170 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought170 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought170 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought170 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought170 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought170 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought170 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought170 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought170 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought170 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought170 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought170 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought170 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought170 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought170 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought170 instance = new Thought170 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 901.2529551134159;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld1;
    fd0 *= -1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
    Thought lo2 = Thought342.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld3 = 516.9220887384237;
    double ld4 = 401.57083081848265;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld0 = 261.72407417461466;
    double ld1 = 478.5902898023142;
    ab1 = ld0 < ld1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    Output.points[1][5] -= ld0;
        boolean lb2 = false;
    ab1 = !ab2;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2();
}
    ld1 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb2, lb3);
}
    ld0 = ld1 - fd0;
    if (ab1) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo4 = Thought339.getInstance(ld0, ld1, fd0, fd1, fb1, lb2, lb3, ab1);
        Output.points[1][6] += ld0;
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
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    Thought lo1 = Thought324.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    ad2 *= -1;
    Output.points[1][7] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld2 = 51.8879187280897;
if(fo1 != null){
      fo1.m3();
}
    ad1 = ad2 + ad3;
    lb0 = ad4 > fd0;
    double ld3 = 574.6679954271924;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    Thought lo4 = Thought299.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2, fb0, fb1, lb0, fb0);
    fb1 = !lb0;

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
    boolean lb0 = false;
    ab1 = !ab2;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought165.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    boolean lb3 = false;
    boolean lb4 = true;
    ab4 = fb0 && fb1;
    boolean lb5 = true;
    lb0 = ad2 > ad3;
    Thought lo6 = Thought251.getInstance(fo1, fo0, fo1, fo0, lb1, lb3, lb4, lb5);
    ad4 = fd0 - fd1;
    boolean lb7 = true;
    lb7 = ab1 || ab2;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
    ab3 = ab4 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = lb0 && lb1;
    lb3 = !lb4;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        if (fb0) {
            fb1 = fd0 < fd1;
            Thought lo0 = Thought115.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
              ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
            for(int i0=0; i0<10; i0++){
                fd0 = fd1 + fd0;
if(fo0 != null){
                  ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
                Thought lo1 = Thought112.getInstance(ao4, fo0, fo1, ao1);
                fb0 = fb1 && fb0;
                double ld2 = 851.805857178177;
if(ao2 != null){
                  fb1 = ao2.m2(fd0, fd1, ld2, fd0);
}
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
                ld2 = fd0 - fd1;
                Output.points[1][8] += ld2;
                fd0 = fd1 - ld2;
if(ao4 != null){
                  ao3 = ao4.m4();
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    double ld2 = 119.36691624634824;
    double ld3 = 845.2170792661194;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, ld3, ad1, ad2, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    fb1 = !lb0;
    if (lb1) {
        Thought lo4 = Thought246.getInstance(ao3, ao4, fo0, fo1);
        ld3 *= -1;
        boolean lb5 = true;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld3);
}
if(ao3 != null){
          lb1 = ao3.m2();
}
if(ao4 != null){
          fb0 = ao4.m2(fb1, lb5, lb0, lb1);
}
        double ld6 = 282.58516313418176;
        fb0 = !fb1;
        lb5 = ld3 < ad1;
        lb0 = ad2 > ad3;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld6, lb1, fb0, fb1, lb5);
}
if(ao4 != null){
          ao4.m1(ld2, ld3, ad1, ad2, lb0, lb1, fb0, fb1);
}
        ad3 = ad4 - fd0;
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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo0 = Thought33.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        ab3 = ab4 && fb0;
        fd0 *= -1;
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
    Thought lo0 = Thought133.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought275.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1();
}
    Output.points[2][0] -= ad4;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb2, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought323.getInstance(ad1, ad2, ad3, ad4, lb2, lb3, ab1, ab2);
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          lb2 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        lb3 = fd0 > fd1;
        ad1 = ad2 - ad3;
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = !lb0;
    fb0 = fd0 < fd1;
    Output.points[2][1] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld1 = 24.61821921289535;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 770.3833828031444;
    boolean lb3 = true;
    lb0 = lb3 && fb0;

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
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[2][2] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    double ld2 = 750.1868952667514;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    Output.points[2][3] += ld2;
    fb1 = lb0 && lb1;
    double ld3 = 453.95000926948006;
    boolean lb4 = false;
    lb4 = ld3 > fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][4] += ad2;
    fb1 = ad3 < ad4;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    double ld1 = 76.5996643056018;
    lb0 = !fb0;
    ld1 *= -1;
    Thought lo2 = Thought91.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    boolean lb3 = true;

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
        double ld0 = 272.43452129039247;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    ab1 = ad3 > ad4;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2);
}
    boolean lb1 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(lb2, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 955.9296382038063;
    Output.points[2][5] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    ld1 *= -1;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = ld1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld1, fd0, fd1, ld1);
}
    Output.points[2][6] += fd0;
    fd1 *= -1;
    double ld2 = 705.3571396702511;
    fb1 = ld1 < ld2;
    lb0 = fd0 < fd1;
    Output.points[2][7] -= ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld1);
}
    fb0 = fb1 || lb0;
if(ao3 != null){
      ld2 = ao3.m3();
}
    fb0 = fb1 && lb0;

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
    Thought lo0 = Thought154.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[2][8] -= ad2;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fb0 = ad1 < ad2;
    ad3 *= -1;
    fb1 = ad4 < fd0;
    lb1 = !fb0;
    fd1 = ad1 - ad2;
    fb1 = !lb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    fb1 = ad3 > ad4;
    lb1 = fd0 > fd1;
    Thought lo2 = Thought136.getInstance(ao2, ao3, ao4, fo0);
    Thought lo3 = Thought224.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2();
}
    ad3 *= -1;

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
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = !ab1;
    if (ab2) {
        ab3 = ab4 && fb0;
        double ld0 = 780.2913458749189;
        fb1 = ab1 && ab2;
        ab3 = ab4 || fb0;
        Output.points[3][0] -= ld0;
        fb1 = ab1 && ab2;
if(ao3 != null){
          ao3.m1(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        } else {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb1 = false;
        fd0 = fd1 + fd0;
        fd1 *= -1;
        boolean lb2 = true;
        lb1 = !lb2;
        Thought lo3 = Thought161.getInstance(fd0, fd1, fd0, fd1);
        ab1 = fd0 < fd1;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        ab2 = fd1 > fd0;
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
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[3][1] -= ad2;
    boolean lb0 = false;
if(ao3 != null){
      ao3.m1(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ab2 = ad4 > fd0;
    Thought lo1 = Thought278.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    boolean lb2 = false;
    lb0 = lb2 && ab1;
    Output.points[3][2] -= ad4;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought249.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = true;
    Thought lo1 = Thought80.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    Thought lo2 = Thought148.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    Output.points[3][3] -= fd0;

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
    double ld0 = 366.4580376673546;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought204.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    ld0 = fd0 - fd1;
    boolean lb3 = false;
    ld0 = fd0 + fd1;
    double ld4 = 169.51221599287825;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = ld4 + fd0;
    ab4 = fb0 || fb1;
    lb1 = !lb3;
    ab1 = fd1 > ld0;
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld0, ld4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4);
}
    ab2 = fd0 > fd1;
    ab3 = ld0 > ld4;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return ld4;
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
        fd1 *= -1;
    lb0 = ad1 > ad2;
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    Output.points[3][4] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo1 = Thought205.getInstance();
    fb1 = lb0 && fb0;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    fb1 = ad2 < ad3;
    double ld2 = 214.9195303307692;
if(fo0 != null){
      ad3 = fo0.m3(lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    lb3 = ad4 > fd0;
    Thought lo4 = Thought108.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2, fb0, fb1, lb0, lb3);
    double ld5 = 504.6015762085382;

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
    double ld0 = 321.3347226594089;
    double ld1 = 989.582555369681;
    Output.points[3][5] += ld0;
    ab1 = ab2 && ab3;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        ad4 = fd0 + fd1;
        ld0 = ld1 - ad1;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb2, ab1, ab2);
}
        ad2 *= -1;
        ad3 *= -1;
        Thought lo4 = Thought334.getInstance(fo1, fo0, fo1, fo0);
        ab3 = ad4 > fd0;
        ab4 = !fb0;
        }
    Output.points[3][6] += fd1;
    lb2 = ab1 || ab2;
    Thought lo5 = Thought207.getInstance(ld0, ld1, ad1, ad2);

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
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao4.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[3][7] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Output.points[3][8] += fd0;
    Thought lo0 = Thought105.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought281.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;

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
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    fb0 = ad1 > ad2;
    Output.points[4][0] -= ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    Output.points[4][1] -= ad1;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    double ld0 = 418.9591378669945;

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
    double ld0 = 243.19002599399957;
    ld0 = fd0 - fd1;
    boolean lb1 = false;
    ld0 = fd0 + fd1;
    Output.points[4][2] -= ld0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought96.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
    double ld3 = 179.34124957844736;
    ab2 = ab3 && ab4;
    Output.points[4][3] -= ld0;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0);
}
        fb1 = !lb1;
        Output.points[4][4] += ld3;
if(ao4 != null){
          ab1 = ao4.m2();
}
        boolean lb4 = true;
        fd0 = fd1 + ld0;
        ld3 = fd0 - fd1;
if(fo0 != null){
          ld0 = fo0.m3(ab1, ab2, ab3, ab4);
}
        double ld5 = 667.9588983385153;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld3, fd0, fd1, fb0, fb1, lb4, lb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ld5, ld0, ld3, fd0, ab1, ab2, ab3, ab4);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && ab1;
    Output.points[4][5] += fd0;
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3);
}
    ab2 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab1 = ad4 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 < ad1;
    Thought lo2 = Thought263.getInstance(fb1, lb0, lb1, ab1);

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought149.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld1 = 436.93829284954046;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    lb2 = !fb0;
    fb1 = lb2 || fb0;

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
    Thought lo0 = Thought45.getInstance();
    if (ab4) {
        boolean lb1 = true;
        Thought lo2 = Thought49.getInstance(ab4, fb0, fb1, lb1);
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        Thought lo3 = Thought115.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          ab1 = fo1.m2(fd0, fd1, fd0, fd1);
}
        if (ab2) {
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
              fd0 = fo1.m3();
}
            Output.points[4][6] += fd1;
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
            fd0 = fd1 + fd0;
            Thought lo4 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
if(fo0 != null){
              ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
            Thought lo5 = Thought107.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
            } else if (fb1) {
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    Thought lo1 = Thought274.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    lb0 = fd1 < ad1;
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 && fb0;
    ad3 = ad4 - fd0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought32.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
    ad4 *= -1;
    double ld3 = 706.7259740503955;
    lb0 = fb0 && fb1;
    ad4 = fd0 + fd1;
    lb0 = ld3 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, ad1, ad2);
}
    fb1 = ad3 < ad4;

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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ad1 < ad2;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought212.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought338.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought246.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    Thought lo4 = Thought227.getInstance(fb0, fb1, lb0, ab1);
    ab2 = fd0 > fd1;

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
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    double ld1 = 247.17449026351966;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    lb0 = fd1 < ld1;
    fd0 = fd1 - ld1;
    if (fb0) {
        fd0 = fd1 + ld1;
if(ao1 != null){
          fo1 = ao1.m4();
}
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
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 114.1282080076791;
        ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb1 = fd1 < ld0;
    double ld1 = 376.79486461204925;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 622.6062897911462;
        if (fb0) {
}}
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
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought296.getInstance(ao2, ao3, ao4, fo0);
        fd1 = fd0 - fd1;
        fb0 = !fb1;
        lb0 = fd0 > fd1;
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought354.getInstance();
        fd0 *= -1;
        fd1 = fd0 - fd1;
        boolean lb3 = true;
if(ao1 != null){
          fo1 = ao1.m4(lb0, ab1, ab2, ab3);
}
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb3, lb0);
}
        ab1 = fd0 > fd1;
        double ld4 = 164.44219017606954;
if(ao2 != null){
          ao1 = ao2.m4(ld4, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + ld4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Output.points[4][7] -= fd0;
    boolean lb0 = false;
    Output.points[4][8] += fd1;
    if (lb0) {
        } else if (ab1) {
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
        lb1 = ad1 > ad2;
        lb0 = ad3 > ad4;
        fd0 = fd1 - ad1;
        ab1 = !ab2;
        double ld2 = 44.843183775700425;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        Thought lo3 = Thought335.getInstance(ad1, ad2, ad3, ad4);
        Thought lo4 = Thought150.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ad1);
if(fo0 != null){
          ao4 = fo0.m4();
}
        double ld5 = 746.7645098660984;
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
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fb0 = fd0 < fd1;
    Output.points[5][0] -= fd0;
    double ld2 = 765.4761843595161;
if(fo0 != null){
          fo0.m3(fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld2 + fd0;
        fd1 = ld2 - fd0;
    boolean lb3 = false;
    Output.points[5][1] += fd1;
    lb0 = ld2 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1();
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 388.0865247692276;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought366.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo2 = Thought297.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb0, fb1, lb3, fb0);
}
    Output.points[5][2] += fd1;
    fb1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    lb3 = fb0 && fb1;
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
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
        fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought151.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fd1 > fd0;
    fb0 = fd1 > fd0;

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
