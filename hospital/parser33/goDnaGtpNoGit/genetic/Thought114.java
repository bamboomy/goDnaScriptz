package genetic;
import java.util.ArrayList;
class Thought114 extends Thought{
private static ArrayList<Thought114> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 830.625783501023;
private double fd1 = 413.06300947969805;
private Thought fo0 = null;
private Thought fo1 = null;
Thought114 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought114 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought114 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought114 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought114 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought114 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought114 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought114 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought114 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought114 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought114 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought114 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought114 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought114 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought114 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought114 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought114 instance = new Thought114 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    double ld2 = 812.0722923527261;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb1 = fo0.m2(fd1, ld2, fd0, fd1);
}
    fb0 = ld2 > fd0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    Thought lo3 = Thought281.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    ld2 *= -1;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    fd0 = fd1 + fd0;
    if (ab1) {
        ab2 = ab3 && ab4;
        fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
        ab1 = fd0 < fd1;
        fd0 = fd1 + fd0;
        double ld0 = 771.0192144658233;
        ab2 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
        ab3 = fd0 < fd1;
        ab4 = fb0 && fb1;
        ld0 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld0 = fd0 - fd1;
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        } else if (ab2) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        } else if (ab1) {
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        ab3 = fd0 < fd1;
        double ld1 = 221.62345681967162;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        Output.points[8][0] += ld1;
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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + ad1;
    lb0 = !fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    lb0 = ad4 < fd0;
    Thought lo1 = Thought365.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    if (fb0) {
        fb1 = lb0 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        fb1 = ad2 > ad3;
        double ld2 = 22.587125471828216;
        ad3 = ad4 + fd0;
if(fo1 != null){
          lb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
        Output.points[8][1] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
    ab3 = ab4 && fb0;
    fb1 = ad3 > ad4;
    ab1 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ab4 = fb0 || fb1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
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
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 872.5223080073628;
    fb0 = !fb1;
    if (fb0) {
        fb1 = ld0 < fd0;
        } else {
        fb0 = fb1 || fb0;
                for(int i0=0; i0<10; i0++){
            fb1 = fd1 > ld0;
            fd0 = fd1 + ld0;
            boolean lb1 = false;
            Thought lo2 = Thought118.getInstance(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
            double ld3 = 502.0375153763611;
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
    fb1 = !fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    lb1 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3(lb2, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
    if (lb0) {
        fd0 = fd1 - ad1;
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
    fd1 = fd0 + fd1;
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Output.points[8][2] -= fd1;
    ab1 = fd0 < fd1;
    fd0 *= -1;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        boolean lb0 = true;
        fd1 *= -1;
        ab1 = ab2 || ab3;
        Output.points[8][3] += fd0;
        ab4 = fb0 && fb1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        if (lb0) {
            Thought lo1 = Thought50.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
            fd1 = fd0 + fd1;
            ab1 = fd0 < fd1;
            ab2 = !ab3;
if(ao1 != null){
              ab4 = ao1.m2();
}
            fb0 = !fb1;
            Output.points[8][4] -= fd0;
            double ld2 = 400.3215699751552;
            lb0 = ab1 && ab2;
            fd0 *= -1;
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
    ab2 = ab3 && ab4;
    Thought lo0 = Thought26.getInstance(fb0, fb1, ab1, ab2);
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    double ld1 = 596.537010094778;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    Output.points[8][5] += fd1;
    Thought lo3 = Thought116.getInstance(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3);
    Output.points[8][6] -= ad4;
    ab2 = ab3 || ab4;
if(ao3 != null){
      fd0 = ao3.m3();
}
    fd1 = ld1 - ad1;

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
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    Output.points[8][7] -= fd1;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
          ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 636.1729457534991;
    ld1 = fd0 + fd1;
    ld1 *= -1;
    ab4 = !fb0;

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
    double ld0 = 380.8804865809296;
    Thought lo1 = Thought51.getInstance();
        boolean lb2 = true;
    ad1 = ad2 - ad3;
        boolean lb3 = true;
    Thought lo4 = Thought81.getInstance(lb2, lb3, fb0, fb1);
    Output.points[8][8] += ad4;
    Thought lo5 = Thought362.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, lb2, lb3, fb0, fb1);
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
    Output.points[0][0] -= fd1;
    lb2 = !lb3;

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
    Thought lo0 = Thought126.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought38.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    double ld2 = 886.7842295629388;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ld2, ab4, fb0, fb1, ab1);
}
    ad1 *= -1;

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
    Output.points[0][1] -= fd0;
    double ld0 = 869.8076101817702;
    fd0 = fd1 - ld0;
    double ld1 = 73.28650631162863;
    Output.points[0][2] -= ld1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + ld0;
    if (fb0) {
        Thought lo3 = Thought86.getInstance(ld1, fd0, fd1, ld0);
        double ld4 = 50.28453659707877;
if(ao1 != null){
          ld0 = ao1.m3(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld4);
}
        fb1 = !lb2;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb2, fb0);
}
        fb1 = !lb2;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
        lb2 = fb0 || fb1;
        ld4 = ld0 - ld1;
        lb2 = fd0 > fd1;
        fb0 = ld4 > ld0;
        fb1 = ld1 < fd0;
if(ao3 != null){
          ao3.m2(fd1, ld4, ld0, ld1, lb2, fb0, fb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought25.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld1 = 651.6894938627316;
    fb0 = !fb1;
    fb0 = !fb1;
    double ld2 = 808.292361040848;
    Thought lo3 = Thought78.getInstance(ld2, ad1, ad2, ad3);
        Thought lo4 = Thought88.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1);
    ld2 *= -1;
if(ao4 != null){
      ad1 = ao4.m3();
}
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ld1 = fo0.m3(ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = ad4 > fd0;
        double ld5 = 985.0132289282581;
        boolean lb6 = false;
        double ld7 = 428.84211563125706;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb6, fb0);
}
        double ld8 = 824.069620957506;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    Output.points[0][3] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb1 = lb2 && ab1;
    boolean lb3 = false;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
    ad2 *= -1;
    Output.points[0][4] += ad3;
    ab2 = ab3 || ab4;
    double ld0 = 321.9231615024701;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao2 != null){
      ab3 = ao2.m2();
}
    boolean lb1 = true;
    Output.points[0][5] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;

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
    Output.points[0][6] -= fd0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Output.points[0][7] += fd0;
    double ld2 = 364.289231976416;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    fd1 = ld2 + fd0;
    lb1 = fb0 && fb1;
    boolean lb3 = true;
    double ld4 = 541.660699558427;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ld4);
}
    double ld5 = 857.60468559912;
    boolean lb6 = false;
    boolean lb7 = false;
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
    boolean lb8 = false;
    lb1 = ld5 < fd0;

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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought68.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Output.points[0][8] += fd0;
    fd1 = fd0 - fd1;
    ab2 = fd0 > fd1;

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
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    Output.points[1][0] += ad3;
    fb0 = ad4 < fd0;
    double ld1 = 554.5196704742257;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
        ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1();
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
            ab4 = ad3 < ad4;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    ab1 = ad3 > ad4;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;

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
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 + fd1;
        fb1 = fd0 > fd1;
        double ld0 = 503.667526524074;
        fb0 = ld0 > fd0;
        Output.points[1][1] += fd1;
        fb1 = fb0 && fb1;
        fb0 = ld0 < fd0;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        fb1 = !fb0;
        fd1 = ld0 - fd0;
if(fo1 != null){
          fo1.m1(fd1, ld0, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    fb0 = ad4 > fd0;
    fd1 *= -1;
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    lb1 = !fb0;
    ad1 *= -1;
    fb1 = !lb0;

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
    ab2 = ab3 && ab4;
        fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        fd0 *= -1;
        Thought lo0 = Thought107.getInstance(fb0, fb1, ab1, ab2);
        ab3 = fd1 > fd0;
        fd1 = fd0 - fd1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        fd0 = fd1 + fd0;
        Thought lo1 = Thought128.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
        boolean lb2 = false;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ab3 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(ab4, fb0, fb1, lb2);
}
        fd0 *= -1;
        ab1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = lb2 && ab1;
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    double ld0 = 688.1003862847623;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab4 = fb0 && fb1;
    double ld1 = 348.0858773072816;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    boolean lb2 = false;
    ld1 *= -1;
    lb2 = ab1 && ab2;
    Thought lo3 = Thought32.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m2(ab3, ab4, fb0, fb1);
}
    lb2 = !ab1;
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    boolean lb5 = true;
    ab4 = fb0 && fb1;
    Output.points[1][2] += fd0;
if(ao4 != null){
      fd1 = ao4.m3(ld0, ld1, ad1, ad2, lb2, lb4, lb5, ab1);
}
    ad3 = ad4 - fd0;
    if (ab2) {
        fd1 = ld0 - ld1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 805.6170143717716;
    boolean lb1 = false;
    Thought lo2 = Thought8.getInstance(fd0, fd1, ld0, fd0);
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    fb0 = ld0 < fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    double ld3 = 973.2958258440616;
    ld0 = ld3 + fd0;
    fb1 = fd1 < ld0;
    lb1 = fb0 && fb1;
if(fo0 != null){
      ld3 = fo0.m3();
}
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3, fb1, lb1, fb0, fb1);
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
    ab1 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    Output.points[1][3] += fd1;
    Output.points[1][4] += fd0;
    boolean lb3 = true;
    Output.points[1][5] -= fd1;
    boolean lb4 = true;
    boolean lb5 = true;
    fd0 = fd1 - fd0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fd1 *= -1;
    fb0 = ad1 > ad2;
    fb1 = !fb0;
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    fd1 = ad1 + ad2;
    Thought lo1 = Thought380.getInstance();
    Thought lo2 = Thought317.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;

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
    ad1 *= -1;
    Output.points[1][6] -= ad2;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought68.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld2 = 140.00741138857373;
        double ld3 = 432.07594937893964;
        boolean lb4 = true;
if(fo1 != null){
          ab4 = fo1.m2(ad3, ad4, fd0, fd1);
}
        }
    Output.points[1][7] += ad1;
    fb1 = lb0 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb5 = false;
    ab1 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    lb0 = lb5 || ab1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, lb0, lb5, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo6 = Thought297.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb5);

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
    fd0 = fd1 - fd0;
    fd1 *= -1;
        double ld0 = 828.0723572955419;
    Thought lo1 = Thought327.getInstance(ao1, ao2, ao3, ao4);
    double ld2 = 454.61718829116757;
if(fo0 != null){
      ld0 = fo0.m3(ld2, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0);
}
    fb0 = ld2 < fd0;
    fd1 = ld0 + ld2;
    fd0 = fd1 + ld0;
    fb1 = ld2 < fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 < ld0;
    boolean lb3 = true;
    Thought lo4 = Thought276.getInstance(lb3, fb0, fb1, lb3);
    Output.points[1][8] += ld2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, lb3, fb0);
}
    double ld5 = 969.7150907563446;
    fb1 = ld5 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ld2, ld5, lb3, fb0, fb1, lb3);
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
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    lb0 = ad4 < fd0;
if(ao2 != null){
      ao2.m1();
}
    fd1 = ad1 - ad2;
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(lb1, lb2, fb0, fb1);
}
    lb0 = lb1 || lb2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
        Thought lo3 = Thought351.getInstance(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
    fd1 = ad1 - ad2;
    boolean lb4 = true;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, lb4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought231.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    lb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      lb2 = ao1.m2();
}
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb2;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb3 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, lb2, lb3, ab1);
}
    Output.points[2][0] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb4 = false;

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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld0 = 552.0086421705364;
    fb0 = ad4 > fd0;
    double ld1 = 552.8344062298976;
    double ld2 = 831.2793253019313;
    Output.points[2][1] += ad4;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = !ab2;
        Thought lo3 = Thought166.getInstance(ab3, ab4, fb0, fb1);
    if (ab1) {
if(ao4 != null){
          ab2 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ld1, ld2, ad1, ab3, ab4, fb0, fb1);
}
        ad2 = ad3 + ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        fb1 = ld2 > ad1;
        ad2 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought293.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought23.getInstance();
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    Thought lo2 = Thought256.getInstance(fb1, fb0, fb1, fb0);
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb4, lb5, fb0, fb1);
}
    lb3 = fd0 < fd1;

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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    Thought lo1 = Thought142.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
    fb0 = !fb1;
    lb0 = !lb2;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought37.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[2][2] += fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought286.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
