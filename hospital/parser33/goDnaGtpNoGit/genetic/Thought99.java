package genetic;
import java.util.ArrayList;
class Thought99 extends Thought{
private static ArrayList<Thought99> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 867.2110725697632;
private double fd1 = 80.16588742464894;
private Thought fo0 = null;
private Thought fo1 = null;
Thought99 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought99 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought99 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought99 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought99 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought99 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought99 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought99 instance = new Thought99 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    Thought lo0 = Thought336.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    double ld1 = 330.2262491644545;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3();
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    Output.points[5][3] += fd0;
    double ld1 = 619.0589801276793;
    ab2 = fd0 > fd1;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[5][4] -= fd1;
    ld1 = fd0 - fd1;
    boolean lb2 = true;
    double ld3 = 34.78482800219481;
    lb0 = lb2 && ab1;
    boolean lb4 = false;
    ab1 = ld1 < ld3;
    double ld5 = 135.39922059283091;

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
    ad1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    lb1 = fd1 < ad1;
        boolean lb2 = true;
    lb2 = ad2 > ad3;
    boolean lb3 = false;
    boolean lb4 = true;
    Output.points[5][5] -= ad4;
    Thought lo5 = Thought147.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    lb3 = lb4 && fb0;
    boolean lb6 = true;

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
    ab1 = ad4 > fd0;
    double ld0 = 677.2531484211112;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought45.getInstance();
    double ld2 = 55.79685292268658;
    ab2 = ld2 > ad1;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    boolean lb3 = true;
    Output.points[5][6] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ad1, ad2, fb1, lb3, ab1, ab2);
}
    ad3 *= -1;
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        ad4 = fd0 + fd1;
        ab1 = !ab2;
        ld0 = ld2 + ad1;
        Output.points[5][7] += ad2;
        double ld4 = 661.2443785472431;
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Output.points[5][8] += fd0;
    Output.points[6][0] -= fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought69.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought218.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld2 = 239.27479111119894;
    fb1 = ld2 > fd0;
        double ld3 = 468.6008312238389;
    fd0 = fd1 - ld2;
    ld3 = fd0 + fd1;
if(ao1 != null){
      ld2 = ao1.m3(ld3, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    ld3 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ld3, fd0, fd1);
}
    Thought lo4 = Thought51.getInstance(ao2, ao3, ao4, fo0, ld2, ld3, fd0, fd1);
    fb1 = fb0 || fb1;
    ld2 = ld3 - fd0;
    Output.points[6][1] -= fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3();
}
    fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ad4 = ao3.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    lb2 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    if (lb0) {
if(fo0 != null){
          fd0 = fo0.m3(lb1, lb2, fb0, fb1);
}
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb3, lb0, lb1, lb2);
}
if(fo1 != null){
          fo1.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb3, lb0);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, lb1, lb2, fb0, fb1);
}
        boolean lb4 = true;
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
    boolean lb0 = true;
    fd1 *= -1;
    double ld1 = 760.2103254301627;
    lb0 = ab1 && ab2;
        ld1 = fd0 - fd1;
    Output.points[6][2] -= ld1;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    fb1 = !lb0;
    ld1 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought132.getInstance(fd1, ld1, fd0, fd1);
    ab1 = ld1 < fd0;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    Output.points[6][3] += ld1;
    double ld3 = 595.5914993669701;
    ld3 = fd0 - fd1;
    double ld4 = 90.8412401193147;
    boolean lb5 = true;
    ab1 = ld1 > ld3;
    ld4 = fd0 + fd1;
    Output.points[6][4] += ld1;

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
          ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought5.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
    Output.points[6][5] += ad4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    boolean lb1 = true;
    lb1 = !ab1;
    ab2 = ab3 && ab4;
    ad4 *= -1;
    Thought lo2 = Thought292.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
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
    Thought lo0 = Thought398.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        double ld1 = 624.1967030334823;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        ld1 = fd0 - fd1;
        boolean lb2 = false;
        ld1 = fd0 - fd1;
        double ld3 = 586.2216664609848;
        ld3 = ld1 - fd0;
        boolean lb4 = false;
        double ld5 = 116.59285742935202;
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
    double ld0 = 228.31743923053642;
if(fo0 != null){
      fo0.m1();
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    double ld1 = 257.3129578430566;
        fb0 = ld0 > ld1;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought233.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    Output.points[6][6] -= fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
    ab2 = ld1 > fd0;
    ab3 = ab4 && fb0;
    if (fb1) {
        fd1 = ld0 - ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
        fd0 *= -1;
        boolean lb3 = true;
        double ld4 = 79.10367188584775;
        double ld5 = 586.9819035477483;
        if (lb3) {
            ld1 = fd0 + fd1;
            ab1 = ab2 && ab3;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2();
}
    fb1 = ad1 < ad2;
    ad3 *= -1;
    Thought lo0 = Thought54.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    double ld1 = 807.680666521632;
    fd0 = fd1 - ld1;

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
    ab2 = ab3 && ab4;
    Output.points[6][7] -= ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m1(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought379.getInstance(ad4, fd0, fd1, ad1);
    Thought lo1 = Thought118.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    if (ab1) {
        fd1 *= -1;
        ab2 = ad1 < ad2;
        Thought lo2 = Thought184.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought98.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = ad1 > ad2;
if(fo0 != null){
          fb1 = fo0.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        double ld4 = 594.752221099184;
        Thought lo5 = Thought318.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
        ab3 = !ab4;
        boolean lb6 = true;
        Thought lo7 = Thought249.getInstance(fo1, fo0, fo1, fo0);
        Thought lo8 = Thought126.getInstance(ld4, ad1, ad2, ad3);
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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb1 = false;
    fd1 *= -1;
    if (lb1) {
        fd0 *= -1;
        fb0 = fd1 > fd0;
        fb1 = lb0 || lb1;
        if (fb0) {
if(ao3 != null){
              ao2 = ao3.m4(fb1, lb0, lb1, fb0);
}
            double ld2 = 890.8517960877646;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
            fb1 = !lb0;
if(fo0 != null){
              ao4 = fo0.m4(fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
              ld2 = fo1.m3(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb0);
}
            lb1 = !fb0;
            fb1 = fd0 > fd1;
            lb0 = lb1 && fb0;
            Output.points[6][8] -= ld2;
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
              fb1 = ao4.m2(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
              fo0.m1();
}
            lb0 = lb1 || fb0;
            ld2 = fd0 + fd1;
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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought277.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought362.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[7][0] += fd1;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4);
}
    Output.points[7][1] -= fd0;
    fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
    Output.points[7][2] -= fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb2 = true;
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
}
    Output.points[7][3] -= fd0;
    boolean lb3 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought369.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought205.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    for(int i0=0; i0<10; i0++){
        double ld2 = 248.51145852804652;
        ld2 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][4] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(ao4 != null){
      ao4.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
    Output.points[7][5] += ad2;
    ab4 = fb0 && fb1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = ad4 > fd0;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
    lb1 = ab1 && ab2;
    double ld2 = 404.65420273508533;

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
    Output.points[7][6] -= fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    double ld1 = 471.7486963559637;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    double ld2 = 841.2124017934456;
    fb0 = fd0 < fd1;
    boolean lb3 = true;
    Output.points[7][7] -= ld1;
    fb0 = fb1 && lb0;
    lb3 = ld2 < fd0;
    if (fb0) {
        Output.points[7][8] -= fd1;
        ld1 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(ld2, fd0, fd1, ld1, lb0, lb3, fb0, fb1);
}
        Thought lo4 = Thought88.getInstance(fo0, fo1, fo0, fo1, lb0, lb3, fb0, fb1);
        } else if (lb0) {
        ld2 = fd0 - fd1;
        lb3 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    boolean lb0 = true;
    boolean lb1 = false;
        ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    lb0 = lb1 || ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = fd0 - fd1;
    fb1 = lb0 && lb1;
    ab1 = fd0 > fd1;
    double ld2 = 494.80826830197213;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    double ld2 = 322.85303745060315;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb3, fb0);
}
    fb1 = lb0 && lb1;
    ad4 *= -1;
    fd0 = fd1 + ld2;
    Thought lo4 = Thought308.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(fd0, fd1, ld2, ad1, lb1, lb3, fb0, fb1);
}
    Thought lo5 = Thought88.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb3, fb0);
    boolean lb6 = true;
    ad2 = ad3 - ad4;
    fb0 = fb1 || lb0;
        fd0 = fd1 - ld2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo0.m3();
}
        double ld0 = 652.6904752072143;
        Thought lo1 = Thought296.getInstance(fb0, fb1, ab1, ab2);
        boolean lb2 = false;
        boolean lb3 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[8][0] -= fd0;
    fb1 = !fb0;
        fd1 = fd0 - fd1;
    fb1 = !fb0;
    Thought lo0 = Thought88.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought378.getInstance(ao2, ao3, ao4, fo0);
    double ld2 = 836.5195439124819;
    ld2 *= -1;
    Thought lo3 = Thought175.getInstance(fd0, fd1, ld2, fd0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb4 = false;
    Output.points[8][1] -= ld2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb4, fb0);
}
    fb1 = lb4 && fb0;

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
    Thought lo0 = Thought276.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    double ld1 = 807.0449694892426;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    ad3 *= -1;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    double ld3 = 757.1154813940129;
    lb2 = ad3 > ad4;
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo5 = Thought137.getInstance(fd1, ld1, ld3, ad1);
    lb4 = ad2 < ad3;
    Thought lo6 = Thought127.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1);
    ld3 = ad1 + ad2;
    Thought lo7 = Thought112.getInstance();
    ad3 = ad4 + fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
        Output.points[8][2] += fd0;
        double ld1 = 966.5271235048178;
    fb0 = fb1 || lb0;
    ab1 = !ab2;

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
    Thought lo0 = Thought281.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought61.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
if(ao1 != null){
      ad3 = ao1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    double ld3 = 850.2613036490352;
if(ao1 != null){
      lb2 = ao1.m2(ad4, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    Output.points[8][3] -= ad4;
    double ld4 = 108.38995783513619;
    ad4 *= -1;
    fd0 = fd1 + ld3;
    double ld5 = 91.29598700121586;
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb2, ab1);
}
    boolean lb6 = true;
    ab1 = ld5 < ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[8][4] += ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    double ld7 = 56.783364599002866;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, ld4, ld5, ld7);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb8 = true;
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;

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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought119.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
        fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    Output.points[8][5] -= fd0;
    fb1 = fb0 || fb1;
    fd1 *= -1;

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
    boolean lb0 = true;
    lb0 = !ab1;
    double ld1 = 73.00301172858275;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought272.getInstance(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
    boolean lb4 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fb0 = fb1 || lb0;
    ld1 *= -1;
    fd0 *= -1;
    lb2 = fd1 > ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb4, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;

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
    double ld0 = 666.9525704677774;
    boolean lb1 = false;
    ld0 = ad1 + ad2;
    boolean lb2 = false;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    boolean lb3 = true;
    lb1 = ld0 < ad1;
    Thought lo4 = Thought123.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, lb1, lb2, lb3, fb0);
}
    ad3 = ad4 - fd0;

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
    double ld0 = 671.7853970303352;
    ab1 = !ab2;
    ld0 *= -1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    boolean lb1 = true;
    if (ab4) {
        fb0 = ad4 > fd0;
        fd1 = ld0 - ad1;
        Output.points[8][6] -= ad2;
        double ld2 = 249.9116518569545;
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
    double ld0 = 7.4051546116082765;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = fb0 && fb1;
        fd0 = fd1 - ld0;
        fd0 = fd1 - ld0;
        fb0 = fb1 || fb0;
        } else {
        Output.points[8][7] += fd0;
if(ao4 != null){
          fd1 = ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ld0;
        Thought lo1 = Thought120.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
        fb0 = fd0 > fd1;
        ld0 = fd0 + fd1;
        fb1 = ld0 > fd0;
        double ld2 = 355.67830238400137;
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 - ld2;
            fb0 = ld0 < fd0;
            Output.points[8][8] += fd1;
            boolean lb3 = false;
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2);
}
            ld2 *= -1;
            fb0 = ld0 < fd0;
            fb1 = lb3 && fb0;
if(ao3 != null){
              fb1 = ao3.m2(fd1, ld2, ld0, fd0);
}
if(ao4 != null){
              ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, ld0, fd0);
}
}}
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
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
if(ao2 != null){
      ao2.m3();
}
    Thought lo0 = Thought298.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Thought lo1 = Thought149.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
        if (fb0) {
        fb1 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        if (fb0) {
            ad1 *= -1;
            boolean lb2 = true;
if(ao3 != null){
              ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
            double ld3 = 327.1321860719168;
            ad2 *= -1;
            Thought lo4 = Thought41.getInstance(ao2, ao3, ao4, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
    fb0 = !fb1;
    Output.points[0][0] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought334.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought73.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
    boolean lb3 = false;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Output.points[0][1] += fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    boolean lb4 = false;
    Thought lo5 = Thought35.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    double ld6 = 142.09177019432738;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld6, fd0, fd1);
}
    ld6 = fd0 - fd1;
    ld6 = fd0 - fd1;
    lb1 = !lb3;
    Thought lo7 = Thought278.getInstance();
    ld6 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ad1 > ad2;
    Output.points[0][2] += ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    ad4 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad1 *= -1;
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought123.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 *= -1;

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
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[0][3] -= fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = !fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
        fb0 = fb1 && lb0;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;

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
    Thought lo0 = Thought107.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[0][4] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb1 = fb0 && fb1;
    boolean lb2 = false;
if(fo0 != null){
      lb1 = fo0.m2();
}
    Thought lo3 = Thought233.getInstance(lb2, fb0, fb1, lb1);
        fd1 = fd0 - fd1;
    Thought lo4 = Thought204.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb1 = fd0 > fd1;
    lb2 = !fb0;
    fd0 = fd1 - fd0;
    boolean lb5 = true;
    boolean lb6 = true;
    lb6 = !fb0;
    fb1 = !lb1;
    lb2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo7 = Thought137.getInstance(fo0, fo1, fo0, fo1, lb5, lb6, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld8 = 231.0533587860691;
if(fo0 != null){
      ld8 = fo0.m3(fd0, fd1, ld8, fd0);
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
    Output.points[0][5] -= fd0;
    Output.points[0][6] -= fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;

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
