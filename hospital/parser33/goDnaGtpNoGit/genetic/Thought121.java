package genetic;
import java.util.ArrayList;
class Thought121 extends Thought{
private static ArrayList<Thought121> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 994.8939437504827;
private double fd1 = 231.70949548854784;
private Thought fo0 = null;
private Thought fo1 = null;
Thought121 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought121 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought121 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought121 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought121 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought121 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought121 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought121 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought121 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought121 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought121 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought121 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought121 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought121 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought121 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought121 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought121 instance = new Thought121 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
        fb0 = fb1 || lb0;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 + fd0;
        Thought lo1 = Thought136.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        fd1 = fd0 + fd1;
        boolean lb2 = true;
        double ld3 = 823.4963116778604;
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld3, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
        double ld4 = 581.6891327282013;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[5][4] += ld4;
        double ld5 = 19.85509877980746;
        boolean lb6 = true;
        ld5 = fd0 + fd1;
        lb2 = lb6 && fb0;
        ld3 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(lb0, lb2, lb6, fb0);
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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[5][5] -= fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[5][6] -= fd1;
    Output.points[5][7] -= fd0;
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    ab1 = fd1 < fd0;
    fd1 *= -1;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    Output.points[5][8] += fd0;
    fb0 = fd1 < fd0;
    boolean lb1 = true;

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
    Output.points[6][0] += ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    Output.points[6][1] += ad3;
    Output.points[6][2] += ad4;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought335.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought278.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought66.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[6][3] -= ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    double ld3 = 244.38579536933742;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1);
}
    fb1 = fb0 && fb1;

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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 *= -1;
    double ld0 = 909.9427955695903;
    Output.points[6][4] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    ad2 *= -1;
    ab2 = ad3 > ad4;
    double ld1 = 954.0497709956907;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    double ld2 = 300.5169016060669;
if(fo0 != null){
      fo0.m1(ld1, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Output.points[6][5] += ad3;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
    boolean lb3 = true;
    double ld4 = 971.838201236053;
    Thought lo5 = Thought305.getInstance(ad3, ad4, fd0, fd1);
    boolean lb6 = true;
    Output.points[6][6] += ld0;
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, ld4, ad1);
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
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    boolean lb1 = true;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought72.getInstance(fo0, fo1, ao1, ao2);
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;
    Thought lo3 = Thought120.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
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
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo0 = Thought247.getInstance(fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = ad4 < fd0;
        boolean lb1 = false;
        Thought lo2 = Thought332.getInstance(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
        }
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb3 = false;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ad1);
}
    fb1 = lb3 || fb0;
    Thought lo4 = Thought265.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb3, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb3, fb0);
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
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought22.getInstance(ab4, fb0, fb1, ab1);
    double ld1 = 36.35171630714221;
    ld1 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    Output.points[6][7] -= ld1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb2, ab1);
}
    ab2 = ab3 && ab4;

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    ad1 = ad2 - ad3;
    Output.points[6][8] -= ad4;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = !ab1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought339.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
if(ao4 != null){
      ao4.m1();
}
    if (ab2) {
if(fo0 != null){
          fo0.m1(ab3, ab4, fb0, fb1);
}
        boolean lb2 = true;
        lb2 = ad3 > ad4;
        if (lb0) {
            if (ab1) {
                Thought lo3 = Thought65.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
                fb1 = ad3 < ad4;
if(fo0 != null){
                  ao4 = fo0.m4(fd0, fd1, ad1, ad2, lb2, lb0, ab1, ab2);
}
                boolean lb4 = true;
if(ao1 != null){
                  fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
                for(int i0=0; i0<10; i0++){
                    for(int i1=0; i1<10; i1++){
                        ad3 = ad4 - fd0;
}}}}}
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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 282.5840484195974;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought38.getInstance(ld0, fd0, fd1, ld0);
    double ld2 = 308.93643275553876;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
    ld2 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
    Thought lo3 = Thought345.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb0, fb1, lb4, fb0);
}
    fb1 = !lb4;

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
    if (ab1) {
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
        Thought lo0 = Thought146.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
        ab4 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        double ld1 = 460.59577041911564;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought49.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought317.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[7][0] += ad2;
    fb1 = ad3 < ad4;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ad1 > ad2;
    ab3 = ad3 < ad4;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    Output.points[7][1] += ad3;
    ab3 = ad4 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
    Thought lo1 = Thought13.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 345.7317596753823;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought217.getInstance();
    fb0 = fd0 < fd1;
        boolean lb2 = true;
    fb0 = ld0 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb2, fb0, fb1);
}
    Output.points[7][2] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    fb0 = !fb1;
if(ao3 != null){
      lb2 = ao3.m2(fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
    fd1 = ld0 + fd0;
    boolean lb3 = true;
    fd1 *= -1;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, lb3, fb0);
}
        for(int i0=0; i0<10; i0++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    double ld0 = 421.8144629001779;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, ad1);
}
        double ld1 = 869.656501971057;
        Thought lo2 = Thought312.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
        if (fb1) {
            fb0 = !fb1;
            Output.points[7][3] += fd0;
            Thought lo3 = Thought216.getInstance();
if(ao1 != null){
              fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
            if (fb0) {
if(ao2 != null){
                  fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
                } else if (fb0) {
                boolean lb4 = true;
                double ld5 = 757.9271443799762;
                Thought lo6 = Thought392.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb4, fb0);
                if (fb1) {
                    boolean lb7 = false;
if(ao2 != null){
                      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb7, lb4, fb0, fb1);
}
                    double ld8 = 968.5579514976938;
if(ao2 != null){
                      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
                    fd0 = fd1 - ld8;
                    Thought lo9 = Thought58.getInstance(ld5, ld1, ld0, ad1);
if(ao2 != null){
                      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
}}}}
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
    ab4 = fb0 || fb1;
    double ld0 = 74.41784617080985;
    Output.points[7][4] += ld0;
if(ao1 != null){
      ab1 = ao1.m2();
}
    Thought lo1 = Thought119.getInstance(ab2, ab3, ab4, fb0);
    boolean lb2 = false;
    fb0 = !fb1;
    Thought lo3 = Thought131.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, lb2, ab1, ab2, ab3);
    fd1 = ld0 - fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    ab1 = ab2 || ab3;
    double ld0 = 153.63981009422002;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
    ab4 = ad3 < ad4;
if(ao3 != null){
      fd0 = ao3.m3();
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m2(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    double ld2 = 99.79330808739061;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb1, lb3);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, lb3, ab1, ab2, ab3);
}
    Thought lo4 = Thought97.getInstance(fo0, fo1, ao1, ao2);
    boolean lb5 = false;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;

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
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = true;
    Output.points[7][5] -= fd1;
    fd0 = fd1 + fd0;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
if(fo0 != null){
      fo0.m3(fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought283.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
    Output.points[7][6] -= fd1;
    if (fb1) {
        lb0 = lb1 || fb0;
        boolean lb3 = true;
        fb0 = fb1 || lb3;
        lb0 = !lb1;
        fd0 *= -1;
        double ld4 = 277.9603847363959;
        boolean lb5 = true;
        double ld6 = 402.8806312563261;
        lb1 = fb0 && fb1;
        Thought lo7 = Thought114.getInstance(ld6, fd0, fd1, ld4, lb3, lb5, lb0, lb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb5);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld6, fd0, fd1, ld4);
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
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 994.3417338646698;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    boolean lb1 = false;
    ab1 = !ab2;
        Thought lo2 = Thought60.getInstance();
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    boolean lb4 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
if(fo1 != null){
      ad3 = fo1.m3();
}
    lb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    Output.points[7][7] += fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
    lb1 = !lb2;

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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    double ld0 = 354.05674352813077;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
    Thought lo1 = Thought229.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
    ab1 = !ab2;
    double ld2 = 534.5906102761709;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ld2 > ad1;

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
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 83.24812136603103;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 349.12229676249706;
        fb0 = fb1 || fb0;
        boolean lb2 = false;
        boolean lb3 = true;
        boolean lb4 = false;
        double ld5 = 928.1604890123122;
if(ao3 != null){
          ao2 = ao3.m4(ld5, ld0, fd0, fd1, lb3, lb4, fb0, fb1);
}
        lb2 = lb3 || lb4;
        ld1 = ld5 + ld0;
        fd0 *= -1;
        fb0 = fd1 < ld1;
        if (fb1) {
            ld5 = ld0 - fd0;
            boolean lb6 = true;
            fd1 = ld1 - ld5;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb6, lb2, lb3, lb4);
}
            if (fb0) {
if(ao4 != null){
                  ao4.m3(fo0, fo1, ao1, ao2);
}
                ld0 *= -1;
if(ao4 != null){
                  ao3 = ao4.m4(fd0, fd1, ld1, ld5);
}
if(fo0 != null){
                  fo0.m1(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld1);
}
                boolean lb7 = true;
                ld5 = ld0 + fd0;
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
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      lb1 = ao4.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    double ld2 = 544.6078914684389;
    double ld3 = 754.6191134945765;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(lb0, lb1, fb0, fb1);
}
    ld3 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    boolean lb4 = true;
    ld2 *= -1;
    fb0 = !fb1;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return ld3;
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
    boolean lb0 = false;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][8] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought98.getInstance();
if(ao3 != null){
      fd0 = ao3.m3(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    fd1 *= -1;
    double ld2 = 41.080679665624054;
    Thought lo3 = Thought225.getInstance(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
        fb0 = !fb1;
        fd0 *= -1;
        lb0 = ab1 && ab2;
        boolean lb4 = true;
        Thought lo5 = Thought43.getInstance(fd1, ld2, fd0, fd1);
        ab2 = ld2 < fd0;
        Output.points[8][0] -= fd1;
        Thought lo6 = Thought260.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
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
    boolean lb0 = false;
    Output.points[8][1] += ad1;
    Output.points[8][2] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = ad3 < ad4;
    ab1 = fd0 < fd1;
    double ld1 = 361.1067757570984;
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    ld1 *= -1;
    Output.points[8][3] -= ad1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought69.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
if(ao2 != null){
          fd1 = ao2.m3(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        Output.points[8][4] -= ad4;
        Thought lo3 = Thought22.getInstance(ao2, ao3, ao4, fo0);
        boolean lb4 = false;
        fd0 *= -1;
        boolean lb5 = false;
if(fo1 != null){
          fd1 = fo1.m3(ld1, ad1, ad2, ad3);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(ao1 != null){
          ao1.m2();
}
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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought207.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought336.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
    boolean lb4 = true;
    Output.points[8][5] -= fd0;
    lb2 = lb4 && fb0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = lb2 && lb4;

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
    ab2 = !ab3;
    Thought lo0 = Thought79.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought17.getInstance();
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    boolean lb3 = true;

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
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    Thought lo1 = Thought165.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    Thought lo2 = Thought299.getInstance();
        lb0 = fb0 && fb1;
    lb0 = ad3 > ad4;
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    if (fb0) {
        fb1 = ad1 > ad2;
        Thought lo4 = Thought204.getInstance(lb0, lb3, fb0, fb1);
        ad3 *= -1;
        ad4 *= -1;
        Output.points[8][6] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, lb3, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    Output.points[8][7] += fd0;
    fd1 *= -1;
    fb0 = !fb1;
    lb0 = !fb0;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought122.getInstance(fb1, lb0, fb0, fb1);
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    double ld2 = 972.3741874992153;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    Thought lo0 = Thought251.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    double ld1 = 481.39979750257953;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4();
}
        }
    fb0 = fd0 > fd1;
    ld1 = ad1 - ad2;
if(ao3 != null){
      ad3 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought362.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab3 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    ab3 = !ab4;
    Output.points[8][8] += fd0;
if(ao3 != null){
      ao3.m1(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ab3 = ad1 < ad2;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    Output.points[0][0] -= ad3;
    Thought lo1 = Thought224.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
    ab2 = ad3 > ad4;
    Thought lo2 = Thought199.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
    double ld3 = 114.98758762255103;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ad2 = fo0.m3(ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
        boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb0, lb4, lb5, ab1);
}
    ab2 = ld3 > ad1;
if(fo1 != null){
      ab3 = fo1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb4, lb5, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    for(int i0=0; i0<10; i0++){
        ld3 = ad1 - ad2;
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
        fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 - fd0;
    double ld2 = 337.0496078270501;
    lb1 = fd0 < fd1;
    ld2 = fd0 + fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    Output.points[0][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    boolean lb2 = true;
    fd0 *= -1;
    boolean lb3 = true;
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld4 = 519.3253460207641;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, fb0, fb1);
}
    lb0 = lb1 && lb2;

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
    Output.points[0][2] -= fd1;
    Thought lo0 = Thought137.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[0][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[0][4] += fd0;
        fd1 = fd0 - fd1;
    boolean lb3 = true;
    lb3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
