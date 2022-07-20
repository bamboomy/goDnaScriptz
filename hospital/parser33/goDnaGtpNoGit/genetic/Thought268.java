package genetic;
import java.util.ArrayList;
class Thought268 extends Thought{
private static ArrayList<Thought268> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 443.40854583785483;
private double fd1 = 784.1788671164621;
private Thought fo0 = null;
private Thought fo1 = null;
Thought268 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought268 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought268 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought268 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought268 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought268 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought268 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought268 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought268 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought268 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought268 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought268 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought268 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought268 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought268 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought268 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought268 instance = new Thought268 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 135.35648804538218;
    double ld1 = 748.1696852040511;
    if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Output.points[4][8] += ld0;
        double ld2 = 577.6418440743552;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 && fb1;
        Output.points[5][0] -= ld1;
        fd0 = fd1 + ld2;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
        ld2 = ld0 + ld1;
        fb0 = !fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld0);
}
        ld1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo0 != null){
          fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        ld2 = ld0 - ld1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(ld1, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
        fb1 = ld0 > ld1;
        boolean lb3 = true;
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
    double ld0 = 722.5638585636453;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought72.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 402.9548053895316;
    ld0 *= -1;
    fb0 = ld3 < fd0;
    fb1 = lb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld3, fd0);
}
    double ld4 = 711.1695386469186;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
    boolean lb5 = true;
    ab1 = ld4 > fd0;

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
      fo1 = fo0.m4();
}
    double ld0 = 203.84043112687243;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
    ld0 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
            ad2 = ad3 - ad4;
if(fo0 != null){
              fb1 = fo0.m2(fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
}
            ad2 = ad3 + ad4;
            fb0 = fb1 && lb1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
            Thought lo2 = Thought167.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            Thought lo3 = Thought371.getInstance();
            fb1 = !lb1;
            fd1 = ld0 - ad1;
            double ld4 = 635.7292455451961;
            ad1 = ad2 - ad3;
            fb0 = ad4 > fd0;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Thought lo0 = Thought338.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    ab4 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
if(fo1 != null){
          ab2 = fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
        if (lb1) {
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
            Output.points[5][1] += ad1;
            } else {
if(fo1 != null){
              ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
            fb0 = fb1 && lb1;
            Thought lo2 = Thought74.getInstance(ad3, ad4, fd0, fd1);
            ab1 = ab2 && ab3;
                        ab4 = ad1 > ad2;
                        fb0 = fb1 || lb1;
            double ld3 = 936.7753932852854;
            boolean lb4 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            fd1 *= -1;
if(fo0 != null){
              ld3 = fo0.m3();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        boolean lb0 = false;
        fb0 = !fb1;
        fd1 = fd0 + fd1;
        double ld1 = 768.8620799524338;
        ld1 = fd0 + fd1;
if(ao3 != null){
          ao3.m2(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
        Thought lo2 = Thought37.getInstance(ao4, fo0, fo1, ao1);
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
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    lb0 = fd1 < ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld1 = 744.1356846994545;
    fb0 = fb1 || lb0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ld1 = ao3.m3(lb2, fb0, fb1, lb0);
}
    lb2 = ad1 < ad2;
        ad3 = ad4 - fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2, fb0, fb1, lb0, lb2);
}
    fb0 = ad3 > ad4;
    fb1 = !lb0;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, ad1, lb2, lb3, fb0, fb1);
}
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb2, lb3, fb0);
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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    ab1 = !ab2;
    ab3 = !ab4;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
        fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && ab1;
    fd0 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld1 = 836.5779455388948;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought384.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
    ab4 = fd1 > ad1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    ab1 = ab2 && ab3;
    ab4 = fd1 < ad1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    ad2 = ad3 - ad4;
    Thought lo1 = Thought371.getInstance(fb1, lb0, ab1, ab2);
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    fd0 = fd1 - ad1;
    Thought lo3 = Thought367.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
    fd1 *= -1;
    double ld4 = 821.0751061181054;
    Thought lo5 = Thought338.getInstance(ld4, ad1, ad2, ad3, ab1, ab2, ab3, ab4);

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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb0;
    double ld1 = 73.5164135749588;
    if (fb0) {
        fb1 = !lb0;
        fb0 = ld1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
        lb0 = fd1 > ld1;
        double ld2 = 597.9575294214701;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld2, ld1, fb1, lb0, fb0, fb1);
}
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + ld2;
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld2, ld1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[5][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = false;
    ab3 = fd1 > fd0;

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
    Output.points[5][3] -= ad2;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    double ld1 = 736.1349893729047;
    lb0 = ld1 < ad1;
    ad2 = ad3 - ad4;
    double ld2 = 729.3606856656411;

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
    Thought lo0 = Thought328.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        ad1 *= -1;
    Thought lo1 = Thought240.getInstance(ab3, ab4, fb0, fb1);
    ad2 = ad3 - ad4;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought268.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = ad1 < ad2;
    if (fb0) {
        fb1 = ad3 < ad4;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        Output.points[5][4] -= fd1;
        boolean lb0 = true;
        boolean lb1 = true;
if(ao4 != null){
          ao3 = ao4.m4();
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
        fd1 = fd0 - fd1;
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
        Output.points[5][5] -= fd0;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao1 != null){
              fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
              lb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
            fd1 = fd0 - fd1;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
            double ld2 = 109.65761586470897;
if(ao1 != null){
              ld2 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
            double ld3 = 856.6161258017969;
}}
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
    fb1 = !fb0;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ad4 = ao3.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    Thought lo1 = Thought331.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      lb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
    if (fb0) {
        fd1 = ad1 + ad2;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        lb0 = ad1 < ad2;
        fb0 = ad3 > ad4;
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld2 = 265.4954231039826;
        double ld3 = 962.1107102838283;
        Thought lo4 = Thought142.getInstance(fb1, lb0, fb0, fb1);
        lb0 = ad3 > ad4;
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Output.points[5][6] += fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought264.getInstance();
    Thought lo1 = Thought158.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[5][7] += fd0;
    fb1 = !ab1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb2 = false;
if(ao1 != null){
      ab4 = ao1.m2(fd1, fd0, fd1, fd0);
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
    if (ab1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        ab2 = fd1 > ad1;
        Thought lo0 = Thought41.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m2(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        ab3 = ad4 < fd0;
        boolean lb1 = true;
        fd1 = ad1 - ad2;
        Output.points[5][8] -= ad3;
        ad4 = fd0 + fd1;
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        double ld2 = 313.2700488731555;
        } else if (ab1) {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        ab2 = ad2 < ad3;
        ad4 = fd0 + fd1;
if(ao2 != null){
          ab3 = ao2.m2(ad1, ad2, ad3, ad4);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    lb2 = fd0 > fd1;
    fb0 = fd0 < fd1;
    boolean lb3 = true;
    boolean lb4 = false;
    boolean lb5 = false;
    lb4 = fd0 > fd1;
    lb5 = fd0 > fd1;
if(fo0 != null){
      fo0.m3();
}
    double ld6 = 226.9517815926244;
    Output.points[6][0] -= ld6;
    double ld7 = 79.611882729536;
    ld7 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    lb2 = ld6 < ld7;
    lb3 = fd0 > fd1;
    Output.points[6][1] += ld6;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld7, fd0, fd1, ld6, lb4, lb5, fb0, fb1);
}
    ld7 = fd0 + fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 > fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        Output.points[6][2] -= fd1;
        ab3 = !ab4;
        for(int i1=0; i1<10; i1++){
            if (fb0) {
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
                  fo1.m1();
}
if(fo1 != null){
                  fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
                fd0 *= -1;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
                Output.points[6][3] += fd1;
                Output.points[6][4] += fd0;
                Output.points[6][5] -= fd1;
if(fo1 != null){
                  fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
                ab4 = fd0 > fd1;
                fb0 = fd0 < fd1;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
                double ld1 = 217.91772715561584;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        boolean lb0 = true;
if(fo1 != null){
          fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        fb1 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ad1 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        fb1 = ad2 < ad3;
        ad4 = fd0 + fd1;
        Thought lo1 = Thought326.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
        Thought lo2 = Thought297.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        lb0 = ad4 > fd0;
        fd1 = ad1 - ad2;
        Thought lo3 = Thought179.getInstance(fo0, fo1, fo0, fo1);
        double ld4 = 979.4767213800022;
        fb0 = fb1 && lb0;
        Thought lo5 = Thought282.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, ad1, ad2);
}
        boolean lb6 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
    double ld0 = 856.029011986574;
    ab2 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    double ld1 = 535.832493344936;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    ld1 *= -1;
    Thought lo2 = Thought34.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought162.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      ab2 = fo0.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 && fb1;
        lb0 = fd0 < fd1;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        lb0 = fb0 || fb1;
        fd0 = fd1 - fd0;
        lb0 = fb0 || fb1;
        fd1 = fd0 + fd1;
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
        fb0 = fd0 > fd1;
        Thought lo1 = Thought317.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          fd0 = ao4.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          fb0 = ao4.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        double ld2 = 856.9453828854408;
        ld2 = fd0 + fd1;
        if (lb0) {
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
            ld2 = fd0 + fd1;
            } else if (fb1) {
            boolean lb3 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
if(ao1 != null){
      ao1.m2();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought33.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd0 = fd1 - ad1;
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb0 = ad1 > ad2;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    Thought lo2 = Thought211.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[6][6] -= fd0;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Output.points[6][7] += ad1;

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
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    ab2 = !ab3;
    boolean lb0 = true;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m3();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    double ld2 = 271.65270897348637;
    lb0 = !lb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
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
    ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought315.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    ab4 = fb0 || fb1;
    lb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;

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
    fd0 *= -1;
    boolean lb0 = true;
    Output.points[6][8] += fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought288.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb0 || fb0;
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
        fb0 = !fb1;
    fd0 *= -1;
    Output.points[7][0] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
    ab1 = !ab2;
    boolean lb0 = false;
    Thought lo1 = Thought89.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought391.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, ab1, ab2);
}
        Thought lo3 = Thought121.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb0, lb4, ab1, ab2);
}
    Output.points[7][1] -= fd1;
    Output.points[7][2] += fd0;
    fd1 = fd0 - fd1;
    ab3 = fd0 < fd1;

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
    fb1 = ad1 < ad2;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    Thought lo1 = Thought351.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Thought lo2 = Thought310.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
        lb0 = fb0 || fb1;
        ad2 = ad3 - ad4;
        boolean lb3 = false;
        fd0 = fd1 - ad1;
        boolean lb4 = true;
if(fo0 != null){
          ad2 = fo0.m3();
}
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
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 12.149288681557728;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
    ld0 *= -1;
    Thought lo1 = Thought67.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            Thought lo2 = Thought53.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
            fd0 = fd1 - ld0;
            boolean lb3 = true;
if(fo0 != null){
              ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
            Thought lo4 = Thought351.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
              fo1.m2();
}
            boolean lb5 = false;
            double ld6 = 642.1640944729656;
            }
        ad2 *= -1;
        ad3 *= -1;
        Thought lo7 = Thought349.getInstance(fb1, ab1, ab2, ab3);
        double ld8 = 750.2282049646273;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        Output.points[7][3] -= ld8;
if(fo0 != null){
          fo0.m1(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
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
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][4] += fd1;
    fd0 *= -1;
    double ld1 = 135.4099236333566;
    fd0 *= -1;
    fd1 = ld1 + fd0;
    Output.points[7][5] += fd1;
    ld1 *= -1;
    boolean lb2 = false;
    lb0 = lb2 && fb0;
    boolean lb3 = true;
    Thought lo4 = Thought70.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = ld1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb5, fb0, fb1, lb0);
}
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, lb3, lb5, fb0, fb1);
}
    lb0 = lb2 && lb3;
if(ao3 != null){
      lb5 = ao3.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
        fd0 = fd1 + ld1;
    lb3 = !lb5;
    fb0 = fb1 && lb0;
    lb2 = lb3 && lb5;
    fd0 *= -1;

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
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought172.getInstance(fo1, ao1, ao2, ao3);
    ad1 = ad2 + ad3;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    if (fb0) {
        Thought lo1 = Thought245.getInstance();
        double ld2 = 93.47171233427822;
if(ao4 != null){
          fb1 = ao4.m2(fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Output.points[7][6] -= fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought32.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3();
}
    Output.points[7][7] -= fd1;
if(ao3 != null){
      ao3.m1(lb1, ab1, ab2, ab3);
}
        boolean lb3 = true;

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
    ad1 *= -1;
    ad2 *= -1;
    ab2 = ad3 < ad4;
    ab3 = fd0 > fd1;
    Output.points[7][8] += ad1;
    ab4 = ad2 > ad3;
    Thought lo0 = Thought226.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, ab1, ab2);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
                fd0 = fd1 - fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    double ld0 = 752.8753262214399;
    Thought lo1 = Thought382.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    Output.points[8][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][1] += fd1;
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld2 = 273.219947629595;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    Thought lo2 = Thought48.getInstance();
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, fb0, fb1);
}
    Output.points[8][2] += fd1;
    boolean lb3 = false;
    double ld4 = 39.86512969823275;
    boolean lb5 = true;
    lb0 = lb1 || lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb5, fb0, fb1, lb0);
}
    lb1 = !lb3;
    lb5 = !fb0;
    double ld6 = 562.7301994639547;
    double ld7 = 834.101350255104;

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
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[8][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought237.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[8][4] += fd0;
    Output.points[8][5] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
}
    Output.points[8][6] += fd1;

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
