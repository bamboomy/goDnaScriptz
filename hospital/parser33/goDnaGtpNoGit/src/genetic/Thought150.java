package genetic;
import java.util.ArrayList;
class Thought150 extends Thought{
private static ArrayList<Thought150> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 559.0855675407536;
private double fd1 = 141.71923847138834;
private Thought fo0 = null;
private Thought fo1 = null;
Thought150 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought150 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought150 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought150 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought150 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought150 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought150 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought150 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought150 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought150 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought150 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought150 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought150 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought150 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought150 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought150 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought150 instance = new Thought150 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    double ld0 = 855.0739568256273;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 < fd0;
    Output.points[0][2] += fd1;
    fb0 = ld0 > fd0;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo1 = Thought149.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    boolean lb3 = true;
    lb3 = fb0 && fb1;

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
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    Output.points[0][3] += fd0;
    fb0 = fb1 || lb0;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Thought lo1 = Thought173.getInstance();
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    double ld3 = 872.2143330389823;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld3 + fd0;
    double ld4 = 31.707627477527;
    double ld5 = 453.0181232400622;
    ld5 = fd0 + fd1;
    fb1 = lb0 || lb2;
    ld3 = ld4 + ld5;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    Thought lo0 = Thought299.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(lb2, lb1, fb0, fb1);
}
        lb2 = ad1 < ad2;
        lb1 = ad3 < ad4;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = ad4 < fd0;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
        ab4 = ad2 < ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought276.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    lb1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
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
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 864.1570147890616;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4();
}
if(ao3 != null){
              ad4 = ao3.m3(fb1, fb0, fb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought69.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
        Thought lo2 = Thought227.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
        ab1 = !ab2;
        fd0 *= -1;
        ab3 = fd1 > fd0;
        Output.points[0][4] -= fd1;
        Thought lo3 = Thought340.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        double ld4 = 858.404179612424;
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
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao4.m2(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    lb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought81.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && lb1;
        ab1 = ab2 || ab3;
        for(int i1=0; i1<10; i1++){
if(ao4 != null){
              ao4.m2();
}
if(fo0 != null){
              ad3 = fo0.m3(ab4, fb0, fb1, lb0);
}
            boolean lb3 = false;
            Thought lo4 = Thought393.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, lb0, lb1, ab1, ab2);
            ab3 = ab4 && fb0;
            fb1 = lb3 || lb0;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    double ld0 = 415.7411909886187;
    fd0 = fd1 - ld0;
    fb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 - fd1;
    double ld1 = 609.2764562569162;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    fb0 = ld0 > ld1;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought328.getInstance(fd0, fd1, ld0, ld1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought223.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    ab1 = fd0 < fd1;
    Output.points[0][5] -= fd0;
    Thought lo2 = Thought355.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    Output.points[0][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld3 = 588.6230115690182;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb4 = false;
if(fo0 != null){
      ld3 = fo0.m3(fb0, fb1, lb1, lb4);
}
    fd0 *= -1;
    ab1 = fd1 > ld3;
    ab2 = !ab3;
    Output.points[0][7] -= fd0;
    fd1 = ld3 + fd0;
    double ld5 = 39.6117521070436;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought221.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Output.points[0][8] += fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought155.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;

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
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2();
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ab1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
    ad2 *= -1;
    boolean lb1 = false;
    double ld2 = 776.9210750990046;
    Output.points[1][0] -= ad2;

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
    Thought lo0 = Thought286.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought175.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
    double ld2 = 512.9865931909103;
    fb1 = ld2 > fd0;
        fd1 *= -1;
    ld2 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
    fb0 = fb1 && fb0;
    Thought lo3 = Thought113.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd1 *= -1;
    Output.points[1][1] -= ld2;
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fd1 = ld2 + fd0;
    fb1 = !fb0;

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
    fb0 = ad1 > ad2;
    ad3 *= -1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao3.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
        fb0 = !fb1;
        Thought lo0 = Thought390.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
if(ao4 != null){
          ao3 = ao4.m4();
}
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
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
    ab1 = ab2 && ab3;
    fd1 *= -1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
    double ld0 = 445.1819518085574;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    fd0 *= -1;
    lb1 = ab1 || ab2;
    ab3 = fd1 > ld0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld2 = 947.8219986065507;
    Output.points[1][2] += ld2;
    boolean lb3 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    double ld0 = 552.8365059686483;
if(ao3 != null){
      fb0 = ao3.m2(fb1, ab1, ab2, ab3);
}
    ld0 = ad1 + ad2;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought368.getInstance(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
    ld0 = ad1 - ad2;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
        Thought lo0 = Thought71.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 427.54350838854504;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 212.826258057398;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, fd0, fd1);
}
        lb1 = ld0 > ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
    lb2 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && lb2;
    ld3 = fd0 + fd1;
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld0 = 47.08364963099544;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    double ld1 = 506.0454673113331;
    Output.points[1][3] += ad4;
    fb0 = fd0 > fd1;
    fb1 = ld0 < ld1;
    fb0 = !fb1;
    Thought lo2 = Thought157.getInstance(fo0, fo1, fo0, fo1);
    fb0 = ad1 < ad2;
    double ld3 = 857.6276848163834;
    Output.points[1][4] -= ad2;
    fb1 = ad3 < ad4;
    if (fb0) {
        double ld4 = 416.70335043214783;
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo0 = Thought55.getInstance();
    boolean lb1 = false;
    ad4 *= -1;
    double ld2 = 948.2410407314544;
    ab1 = !ab2;
    boolean lb3 = true;
    ab2 = ad4 < fd0;

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
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[1][5] -= fd0;
    double ld1 = 126.96731023930143;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ld1;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld2 = 150.26979146245242;
    fb1 = !lb0;

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
    fb1 = fb0 || fb1;
    double ld0 = 869.7598531344817;
    Thought lo1 = Thought46.getInstance(ld0, ad1, ad2, ad3);
    Output.points[1][6] -= ad4;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
if(ao2 != null){
      lb2 = ao2.m2();
}
if(ao3 != null){
      ao3.m2(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 < ld0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    fb1 = !lb2;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    Output.points[1][7] += fd1;
    fd0 = fd1 - fd0;
    lb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
        boolean lb2 = false;
    fd0 = fd1 + fd0;

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
    ab2 = ad1 < ad2;
    boolean lb0 = false;
    double ld1 = 973.2651183559627;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
        ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    fd1 = ld1 + ad1;
if(ao4 != null){
      ao4.m1(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
    ld1 *= -1;
    boolean lb3 = false;
    double ld4 = 709.7037577086918;
    double ld5 = 991.7867712515779;
if(fo1 != null){
      ld4 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ld5 = fo0.m3(fo1, ao1, ao2, ao3);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ad1 = ao4.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld1, ld4, ld5, ad1);
}
        if (lb2) {
            Output.points[1][8] -= ad2;
            lb3 = ad3 > ad4;
            ab1 = fd0 < fd1;
            boolean lb6 = true;
if(fo0 != null){
              ao4 = fo0.m4();
}
}}
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
    Thought lo0 = Thought114.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 *= -1;
    lb2 = !lb3;
    Output.points[2][0] += fd0;
    boolean lb4 = false;
    lb4 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb3 = fo0.m2(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb1);
}
        lb2 = fd0 > fd1;
        lb3 = fd0 > fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb2 = lb3 && lb4;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && lb1;
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
    Thought lo0 = Thought158.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        double ld1 = 176.1243453365;
if(fo1 != null){
          ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
if(fo0 != null){
          fo0.m2(ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
        boolean lb2 = false;
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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought225.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    boolean lb2 = false;
    lb1 = !lb2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    lb1 = lb2 || fb0;

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
    Output.points[2][1] -= ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    ad1 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, ab1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        Thought lo2 = Thought135.getInstance(fd1, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
        }
    ad4 = fd0 - fd1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    double ld3 = 701.935743673899;

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
    fb1 = !fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[2][2] += fd1;
if(ao3 != null){
          fb0 = ao3.m2();
}
        fb1 = lb0 && fb0;
        double ld1 = 850.4982016108411;
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
        lb0 = ld1 > fd0;
        if (fb0) {
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
              fo0.m1(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
            fd0 = fd1 - ld1;
            Thought lo2 = Thought98.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
            fb1 = !lb0;
            boolean lb3 = true;
            lb0 = fb0 || fb1;
if(ao4 != null){
              lb3 = ao4.m2(fo0, fo1, ao1, ao2);
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
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(lb1, fb0, fb1, lb0);
}
        Thought lo2 = Thought39.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
          ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    double ld0 = 483.2748507116664;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought137.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
    if (ab4) {
        fb0 = fd1 < ld0;
        fb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 325.0931121879182;
    ab2 = !ab3;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought193.getInstance();
    fd1 *= -1;
    Thought lo2 = Thought204.getInstance(ab4, fb0, fb1, ab1);
    double ld3 = 183.1504955577301;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld3, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
    Output.points[2][3] += ad3;
    Output.points[2][4] -= ad4;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld0, ld3, fb1, lb4, ab1, ab2);
}
    ad1 *= -1;
    double ld5 = 686.6691684992079;
    ab3 = !ab4;

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
    Output.points[2][5] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    lb0 = lb1 && lb2;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 || lb0;

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
    Output.points[2][6] -= fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[2][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[2][8] -= fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2();
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    double ld2 = 384.5030935333904;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo3 = Thought71.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    lb1 = !fb0;
    fd1 = ld2 + fd0;

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
    Output.points[3][0] -= fd0;
    boolean lb0 = true;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Output.points[3][1] -= fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2();
}
    fd0 *= -1;
    lb1 = fd1 > fd0;
    Output.points[3][2] += fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
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
}