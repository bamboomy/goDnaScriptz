package genetic;
import java.util.ArrayList;
class Thought379 extends Thought{
private static ArrayList<Thought379> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 325.8740928546773;
private double fd1 = 68.4016934651928;
private Thought fo0 = null;
private Thought fo1 = null;
Thought379 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought379 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought379 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought379 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought379 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought379 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought379 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought379 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought379 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought379 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought379 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought379 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought379 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought379 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought379 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought379 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought379 instance = new Thought379 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
        fd0 = fd1 - fd0;
        Thought lo1 = Thought127.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
        lb0 = fd1 > fd0;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && lb0;
        fd1 *= -1;
        if (fb0) {
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
            boolean lb2 = true;
            Output.points[6][2] -= fd0;
            fb0 = fd1 < fd0;
            fd1 = fd0 + fd1;
            double ld3 = 158.14184440721624;
            if (fb1) {
                lb2 = ld3 > fd0;
if(fo1 != null){
                  fo1.m3();
}
                double ld4 = 724.4651681929647;
if(fo0 != null){
                  fd0 = fo0.m3(lb0, fb0, fb1, lb2);
}
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, ld3, fd0, lb0, fb0, fb1, lb2);
}
                Thought lo5 = Thought315.getInstance(fd1, ld4, ld3, fd0, lb0, fb0, fb1, lb2);
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb2);
}
}}}
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[6][3] += fd0;
    ab2 = fd1 < fd0;
    Output.points[6][4] += fd1;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought268.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    boolean lb1 = false;

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
      fo1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought177.getInstance(fb0, fb1, fb0, fb1);
    Output.points[6][5] -= ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    Output.points[6][6] -= ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    double ld2 = 148.34564424220977;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb1);
}
    boolean lb4 = false;
    lb3 = !lb4;

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
    if (ab2) {
        } else {
        ab3 = ad2 > ad3;
        double ld0 = 47.24484033521277;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              ab4 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
            boolean lb1 = true;
if(fo0 != null){
              ad4 = fo0.m3(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
            boolean lb2 = false;
if(fo1 != null){
              ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
            ld0 *= -1;
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
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought71.getInstance(fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    boolean lb1 = true;
    Output.points[6][7] -= fd0;
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = lb1 || fb0;
    boolean lb2 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
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
    fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought212.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
    boolean lb2 = true;
    boolean lb3 = false;
    Output.points[6][8] -= ad3;
    Thought lo4 = Thought33.getInstance(ao1, ao2, ao3, ao4);
    lb3 = fb0 || fb1;
    lb0 = lb2 && lb3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    Thought lo5 = Thought221.getInstance();
    lb0 = fd0 > fd1;
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4(lb2, lb3, lb6, fb0);
}
    Thought lo7 = Thought345.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb2, lb3);
    Thought lo8 = Thought359.getInstance(fd0, fd1, ad1, ad2, lb6, fb0, fb1, lb0);
    boolean lb9 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, lb2, lb3, lb6, lb9);
}
    if (fb0) {
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
    ab1 = !ab2;
    Output.points[7][0] -= fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ab3 = ao1.m2();
}
    ab4 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = !fb0;
    Output.points[7][1] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;

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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[7][2] -= fd1;
    Output.points[7][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 905.4820761495463;
    Thought lo1 = Thought352.getInstance(fb1, fb0, fb1, fb0);
    Output.points[7][4] -= fd0;
    Output.points[7][5] += fd1;
    fb1 = fb0 && fb1;
    boolean lb2 = true;
    double ld3 = 540.9248759852471;
    double ld4 = 408.0413968507995;
    ld0 *= -1;
    lb2 = !fb0;
    fb1 = !lb2;
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
    boolean lb5 = true;
    lb5 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld4, fd0, fd1, lb2, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, ld4, fd0, lb2, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb5, fb0, fb1);
}
    Thought lo6 = Thought118.getInstance(fo1, fo0, fo1, fo0);
    lb2 = lb5 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld3, ld4);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    Thought lo0 = Thought373.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought277.getInstance();
    boolean lb2 = true;
    Output.points[7][6] += fd1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
if(fo1 != null){
          fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
        double ld5 = 69.60791641528685;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Thought lo1 = Thought234.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb1 = lb0 && fb0;
    Thought lo2 = Thought346.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    if (fb1) {
        lb0 = !fb0;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        boolean lb3 = true;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
if(fo1 != null){
          fb0 = fo1.m2();
}
        fb1 = ad4 > fd0;
        fd1 *= -1;
if(fo0 != null){
          fo0.m2(lb3, lb0, fb0, fb1);
}
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb3);
}
        lb0 = !fb0;
        fb1 = lb3 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb3, lb0);
}
        fb0 = fb1 && lb3;
        lb0 = ad3 > ad4;
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
    Output.points[7][7] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][8] -= fd0;
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo0 = Thought330.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    ad4 = fd0 - fd1;
    ab2 = ab3 && ab4;
    ad1 *= -1;
    fb0 = fb1 || lb1;
    double ld2 = 417.64314258098887;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought262.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        fd1 *= -1;
        fd0 = fd1 + fd0;
        lb1 = lb2 || fb0;
        Thought lo4 = Thought210.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
          fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(lb3, lb1, lb2, fb0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb3, lb1, lb2);
}
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
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    fb1 = fb0 || fb1;
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought337.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[8][0] += ad4;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
        boolean lb1 = true;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        fb1 = lb1 || fb0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb2 = false;
if(ao4 != null){
          fb0 = ao4.m2(fb1, lb1, lb2, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, lb1, lb2, fb0);
}
        boolean lb3 = false;
        Output.points[8][1] -= ad4;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
        Thought lo4 = Thought99.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    if (fb1) {
        lb0 = ab1 || ab2;
        ab3 = fd0 < fd1;
        fd0 *= -1;
if(fo0 != null){
          ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        Thought lo1 = Thought278.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
        fd1 = fd0 + fd1;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        if (fb0) {
            Thought lo2 = Thought193.getInstance();
}}
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
    boolean lb0 = false;
    Output.points[8][2] -= ad2;
    lb0 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        ad3 *= -1;
        }
        boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb0 = lb1 && ab1;
    ab2 = ad4 < fd0;
    ab3 = fd1 < ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ad1 - ad2;
    lb1 = ad3 > ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought275.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    boolean lb1 = false;
    Output.points[8][3] -= fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1();
}
    lb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    Output.points[8][4] -= fd0;
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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        fd0 = fd1 + fd0;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Output.points[8][5] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    fd1 = ad1 - ad2;
    Output.points[8][6] -= ad3;
    lb0 = ad4 > fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = fd1 < ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
        double ld3 = 985.0249708785936;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ab2 = !ab3;
    ad4 = fd0 - fd1;
    if (ab4) {
if(fo0 != null){
          ad1 = fo0.m3();
}
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
        for(int i0=0; i0<10; i0++){
            ab2 = fd0 > fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              fd0 = fo1.m3(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            ad4 = fd0 + fd1;
            ad1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
            fd1 = ad1 + ad2;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
            boolean lb1 = true;
if(fo0 != null){
              lb0 = fo0.m2();
}
if(fo1 != null){
              fo1.m2(ab1, ab2, ab3, ab4);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    double ld1 = 143.25801302902696;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb2 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb2, fb0, fb1);
}
    fd1 = ld1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;
    Output.points[8][7] -= ld1;
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao3.m1(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
    fd1 *= -1;
    Output.points[8][8] -= ld1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb2, fb0, fb1);
}
    Thought lo3 = Thought69.getInstance(ao4, fo0, fo1, ao1);

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
    fb0 = !fb1;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    if (lb1) {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao2.m2();
}
if(ao3 != null){
          ao3.m2(lb2, fb0, fb1, lb0);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
        ad4 *= -1;
        lb0 = !lb1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, lb1, lb2, fb0, fb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        if (lb0) {
            double ld1 = 486.9419211242337;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            ld1 *= -1;
            double ld2 = 401.5385231571754;
if(ao3 != null){
              ao2 = ao3.m4(ld2, fd0, fd1, ld1);
}
if(ao4 != null){
              ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2);
}
if(ao3 != null){
              fd0 = ao3.m3();
}
            ab1 = ab2 || ab3;
if(ao4 != null){
              ab4 = ao4.m2(fb0, fb1, lb0, ab1);
}
            fd1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(ld1, ld2, fd0, fd1, fb1, lb0, ab1, ab2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 465.0194474075048;
    double ld1 = 226.31693899029756;
    Output.points[0][0] += ld1;
    Thought lo2 = Thought282.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2();
}
if(ao1 != null){
      ad3 = ao1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    ad4 = fd0 + fd1;
    ld0 = ld1 + ad1;
    ad2 *= -1;
    boolean lb4 = true;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      lb3 = ao1.m2(ld1, ad1, ad2, ad3, lb4, ab1, ab2, ab3);
}
    boolean lb5 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ld0);
}
    double ld6 = 660.7722635467368;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld1, ld6, ad1, ad2);
}
if(ao2 != null){
      lb3 = ao2.m2();
}
        ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(lb4, lb5, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ld6, ab3, ab4, fb0, fb1);
}
    Thought lo7 = Thought292.getInstance(ad1, ad2, ad3, ad4, lb3, lb4, lb5, ab1);

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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 269.02056531508845;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought175.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
    double ld3 = 574.7216123684494;
    Thought lo4 = Thought388.getInstance();
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Thought lo5 = Thought276.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld3, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[0][1] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld3, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, ld3, fd0, fd1);
}
    lb0 = fb0 || fb1;
    lb0 = ld1 > ld3;
    fd0 = fd1 + ld1;
        fb0 = ld3 < fd0;
    boolean lb6 = false;
    fb0 = fb1 && lb0;
    lb6 = !fb0;

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
    fd1 *= -1;
    double ld0 = 778.8054841009266;
    Thought lo1 = Thought62.getInstance();
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ld0 *= -1;
    ab4 = fd0 > fd1;
    double ld2 = 731.2308797634605;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb3 = false;

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought288.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Output.points[0][2] -= fd0;
    Output.points[0][3] += fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    fb1 = fb0 && fb1;
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
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
      fo1.m2();
}
    double ld0 = 693.7041876512104;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ad1, fb0, fb1, lb1, lb2);
}
    ad2 = ad3 - ad4;
    ab1 = ab2 && ab3;
    Thought lo3 = Thought360.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = false;
    lb2 = lb4 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    boolean lb5 = false;
    boolean lb6 = false;
    double ld7 = 796.5993006983894;
    double ld8 = 551.6072438862973;
    boolean lb9 = false;
    ld8 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    Output.points[0][4] += fd1;
    boolean lb0 = true;
    double ld1 = 467.35209173292117;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = false;
    lb0 = ld1 > fd0;
    lb2 = !fb0;
    boolean lb3 = false;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, lb2, lb3);
}
    boolean lb4 = true;
    lb4 = fb0 && fb1;

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
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 77.38539791793032;
    Output.points[0][5] -= fd0;
    fd1 = ld0 + ad1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    fb0 = fd1 < ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[0][6] += ad1;
    fb1 = fb0 && fb1;
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
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought324.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    ab2 = fd1 > fd0;
    Thought lo1 = Thought13.getInstance();
    ab3 = ab4 && fb0;
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, ab1, ab2);
}
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, lb3);
}
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
    ad3 = ad4 - fd0;
    ab4 = fd1 < ad1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    ab4 = ad4 > fd0;
    fb0 = fd1 > ad1;
    fb1 = !lb0;
    lb1 = ad2 < ad3;
    ab1 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    double ld3 = 552.6008431580265;
    lb2 = ld3 > fd0;
    double ld4 = 578.2544775609153;
    Output.points[0][7] -= fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, ld4, fd0);
}
    fd1 = ld3 - ld4;
    fd0 = fd1 + ld3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb5, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3, lb2, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld3, lb1, lb2, lb5, fb0);
}
        fb1 = lb1 && lb2;

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
    Thought lo0 = Thought391.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought184.getInstance(fd0, fd1, fd0, fd1);
    double ld3 = 89.49843225501024;
    lb1 = ld3 > fd0;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
    fb0 = fb1 && lb1;
    double ld4 = 377.7561544776553;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo5 = Thought134.getInstance(fb0, fb1, lb1, fb0);
    double ld6 = 962.2147074985094;
    boolean lb7 = false;
    fb0 = ld3 < ld4;
if(fo1 != null){
      ld6 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld4, fb1, lb1, lb7, fb0);
}
    Output.points[0][8] += ld6;
    fd0 = fd1 + ld3;

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
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    Output.points[1][0] -= fd0;
    fd1 = fd0 - fd1;
    fb1 = lb0 && fb0;
    double ld1 = 382.8336737130566;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
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
}
