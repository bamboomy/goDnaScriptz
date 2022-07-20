package genetic;
import java.util.ArrayList;
class Thought47 extends Thought{
private static ArrayList<Thought47> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 288.546737785139;
private double fd1 = 261.9402170747216;
private Thought fo0 = null;
private Thought fo1 = null;
Thought47 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought47 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought47 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Output.points[5][4] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 714.88330284856;
    double ld2 = 971.2324335936703;
    Output.points[5][5] += ld2;
    fd0 = fd1 + ld1;
    double ld3 = 825.1371554902973;
if(fo0 != null){
      fo0.m1(ld2, ld3, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    ld1 = ld2 + ld3;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = ld1 < ld2;
    fb1 = ld3 > fd0;
    fd1 = ld1 + ld2;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought88.getInstance(ld3, fd0, fd1, ld1);
    boolean lb5 = false;
    ld2 = ld3 - fd0;
    fd1 *= -1;
    lb5 = !fb0;
    ld1 *= -1;

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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
    double ld0 = 983.9309553756589;
    ab4 = ld0 < fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        ab1 = fd1 > ld0;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ld0 - fd0;
        fd1 = ld0 - fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && ab1;
        boolean lb1 = true;
        ab1 = !ab2;
        boolean lb2 = true;
if(fo0 != null){
          fo0.m2(ld0, fd0, fd1, ld0);
}
        boolean lb3 = false;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
    Thought lo1 = Thought355.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
    boolean lb4 = false;
    lb2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    lb3 = lb4 || fb0;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    fd1 *= -1;
    ab3 = ad1 > ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    double ld0 = 757.8753566531651;
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    Thought lo2 = Thought188.getInstance(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);

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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fd0 *= -1;
    fd1 *= -1;

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
      ad1 = ao2.m3();
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    if (lb0) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
        ad3 = ad4 - fd0;
        Thought lo1 = Thought196.getInstance(fo1, ao1, ao2, ao3);
        fb1 = lb0 && fb0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          ad2 = fo1.m3();
}
        fb1 = lb0 || fb0;
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
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    Output.points[5][6] += fd0;
    ab4 = fb0 || fb1;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    Output.points[5][7] -= fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ab1 = ao2.m2(ad1, ad2, ad3, ad4);
}
        ab2 = !ab3;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
        boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4();
}
        }
    ad3 = ad4 + fd0;
    ab4 = fb0 && fb1;
    Output.points[5][8] -= fd1;
    Output.points[6][0] -= ad1;
    boolean lb1 = true;
    Thought lo2 = Thought304.getInstance(lb1, ab1, ab2, ab3);
    ad2 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld3 = 132.9061868068884;

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
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 && fb1;
        double ld0 = 506.5283138946854;
        fb0 = fb1 || fb0;
if(fo0 != null){
          ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
        fb1 = fd1 > ld0;
        fb0 = fd0 < fd1;
        Output.points[6][1] += ld0;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb1, fb0, fb1);
}
        boolean lb2 = false;
        lb1 = lb2 && fb0;
        ld0 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb1, lb2, fb0);
}
        double ld3 = 594.2104909056674;
        ld3 = fd0 + fd1;
        fb1 = !lb1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld3, fd0, fd1, lb2, fb0, fb1, lb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
        Output.points[6][2] += fd0;
if(fo0 != null){
          ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          ab2 = fo1.m2();
}
        fd1 = fd0 + fd1;
        boolean lb0 = false;
        ab2 = ab3 && ab4;
        if (fb0) {
            Thought lo1 = Thought270.getInstance(fb1, lb0, ab1, ab2);
            double ld2 = 924.512041790328;
            ab3 = ab4 && fb0;
            fb1 = lb0 || ab1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
            Thought lo3 = Thought87.getInstance(fd0, fd1, ld2, fd0, fb1, lb0, ab1, ab2);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
            Thought lo4 = Thought48.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
if(fo0 != null){
              fo0.m1();
}
            double ld5 = 906.0627156850563;
            ld5 = fd0 + fd1;
            double ld6 = 507.772194501102;
}}
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
    if (fb1) {
        boolean lb0 = true;
        boolean lb1 = true;
        lb0 = lb1 && fb0;
        fb1 = ad1 > ad2;
        lb0 = lb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, lb1, fb0);
}
        ad3 = ad4 + fd0;
        fb1 = lb0 || lb1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
        fd0 = fd1 - ad1;
        ad2 *= -1;
        fb0 = fb1 || lb0;
        ad3 *= -1;
if(fo0 != null){
          lb1 = fo0.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
        Thought lo2 = Thought249.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = ad3 < ad4;
        fb1 = fd0 < fd1;
        boolean lb3 = false;
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought43.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    ab2 = fd0 < fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][3] += ad1;
    ab2 = !ab3;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb2 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought34.getInstance(fo1, fo0, fo1, fo0);
    ab4 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && lb1;
    lb2 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}

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
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd1 < fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[6][4] += fd1;
    fb1 = !lb0;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m3();
}
if(ao4 != null){
      fd0 = ao4.m3(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought282.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    double ld2 = 289.27599626481685;
    lb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    if (fb0) {
        Output.points[6][5] -= fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}
        Output.points[6][6] -= ad4;
if(ao4 != null){
          fb1 = ao4.m2();
}
        fd0 = fd1 - ld2;
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
        lb0 = lb1 || fb0;
        ad1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
        double ld3 = 998.5195202913657;
        fb1 = fd0 < fd1;
if(ao1 != null){
          lb0 = ao1.m2(ld3, ld2, ad1, ad2, lb1, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 6.559638909895841;
    if (ab1) {
        ab2 = ab3 && ab4;
        fb0 = fb1 || ab1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        fb1 = ld0 > fd0;
        boolean lb1 = true;
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
        boolean lb2 = false;
if(ao1 != null){
          ao1.m1(fd1, ld0, fd0, fd1);
}
        lb2 = ld0 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
        ld0 = fd0 - fd1;
        boolean lb3 = true;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Thought lo4 = Thought297.getInstance(lb3, ab1, ab2, ab3);
        ld0 *= -1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
              ao4 = fo0.m4(fd1, ld0, fd0, fd1, lb2, lb3, ab1, ab2);
}
            ab3 = ld0 < fd0;
            Output.points[6][7] += fd1;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
}
            lb2 = ld0 > fd0;
            lb3 = fd1 < ld0;
            ab1 = ab2 || ab3;
            ab4 = fb0 && fb1;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][8] += ad2;
    Thought lo0 = Thought199.getInstance(ao2, ao3, ao4, fo0);
    Output.points[7][0] += ad3;
    double ld1 = 727.6943638120816;
    ad3 = ad4 - fd0;
    ab2 = fd1 < ld1;
    ab3 = ad1 < ad2;
    ab4 = ad3 < ad4;
    Output.points[7][1] -= fd0;
    fb0 = fd1 < ld1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    if (ab2) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
        Output.points[7][2] -= fd0;
        fd1 *= -1;
        if (ab4) {
if(fo0 != null){
              fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][3] -= fd1;
    double ld1 = 486.7559270471959;
    Output.points[7][4] -= ld1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    lb0 = fb0 || fb1;
    lb0 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    lb2 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    double ld3 = 44.34144213958462;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought37.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought65.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fd0 > fd1;
    double ld2 = 495.0380914398026;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought173.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fd0 = fd1 + ld2;
    fb1 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = fd0 < fd1;
if(fo0 != null){
          ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fd1 = fo1.m3(ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        ab4 = fd0 > fd1;
        ld2 = fd0 + fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ld2 = fd0 + fd1;
        Output.points[7][5] += ld2;
        fb0 = fd0 > fd1;
if(fo0 != null){
          ld2 = fo0.m3(fd0, fd1, ld2, fd0);
}
        fb1 = fd1 < ld2;
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
    Thought lo0 = Thought70.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Thought lo1 = Thought337.getInstance();
    fd0 = fd1 - ad1;
    Output.points[7][6] += ad2;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = ad3 < ad4;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    Output.points[7][7] += ad2;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    Thought lo3 = Thought214.getInstance(fo0, fo1, fo0, fo1);
    double ld4 = 852.0615454077297;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld5 = 819.3383011700654;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ld5, ad1, ad2);
}
    fb1 = !lb2;
    double ld6 = 675.5480627498716;
if(fo1 != null){
      fb0 = fo1.m2();
}

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
if(fo0 != null){
      ad2 = fo0.m3(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    double ld0 = 515.7463596409776;
    ab1 = ad2 < ad3;
    ab2 = ad4 < fd0;
    fd1 = ld0 + ad1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - ad1;
    fb0 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
    boolean lb1 = true;
    boolean lb2 = false;
    Output.points[7][8] += ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld3 = 561.6464225670328;
    lb1 = ad4 < fd0;
    boolean lb4 = true;
    lb2 = fd1 > ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb4 = fo1.m2(ld3, ad1, ad2, ad3);
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
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
    Output.points[8][0] -= fd1;
    lb0 = fb0 || fb1;
    fd0 *= -1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;

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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    double ld0 = 128.90877317846372;
    boolean lb1 = true;
if(ao2 != null){
      ld0 = ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
    lb1 = fd1 < ld0;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        ad4 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb1 = lb1 && fb0;
        boolean lb2 = false;
        boolean lb3 = true;
        double ld4 = 988.0526392081281;
        double ld5 = 803.8601616668143;
if(ao1 != null){
          fo1 = ao1.m4(lb1, fb0, fb1, lb2);
}
        lb3 = ad3 > ad4;
        lb1 = !fb0;
        fb1 = fd0 > fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld1 = 715.7551594263409;
    fb1 = !lb0;
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    double ld2 = 902.02527032581;
    Output.points[8][1] -= fd0;
    boolean lb3 = true;

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
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought262.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1();
}
    ad4 = fd0 + fd1;
    ab2 = !ab3;
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    ab3 = ad3 < ad4;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought276.getInstance(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
    ad1 = ad2 + ad3;
    ab4 = ad4 < fd0;
    fb0 = fd1 > ad1;
    boolean lb3 = true;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb3);
}
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    boolean lb4 = true;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb5 = true;

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
    Thought lo0 = Thought89.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought324.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    double ld2 = 237.74662117792454;
    Thought lo3 = Thought246.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    double ld4 = 436.3852000045958;
    fb0 = ld4 > fd0;
    boolean lb5 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought357.getInstance(fd1, ld2, ld4, fd0);
    fb1 = lb5 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld4, fd0);
}
    fb1 = lb5 && fb0;
    fb1 = fd1 < ld2;
if(fo0 != null){
      lb5 = fo0.m2();
}
    fb0 = fb1 || lb5;
    boolean lb7 = false;
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(lb7, fb0, fb1, lb5);
}
    ld2 = ld4 + fd0;
    fd1 = ld2 - ld4;
if(fo0 != null){
      lb7 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld4, fb0, fb1, lb5, lb7);
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
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    double ld0 = 50.01195879002833;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    ab2 = ab3 || ab4;
    double ld1 = 480.41009284393004;
    boolean lb2 = false;
    ab4 = fd0 < fd1;
    ld0 = ld1 - fd0;
    fd1 = ld0 - ld1;
    fd0 = fd1 - ld0;
    ld1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
    boolean lb3 = false;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb2 = fo1.m2();
}
        Thought lo4 = Thought303.getInstance(lb3, ab1, ab2, ab3);

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
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought240.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    double ld2 = 564.5018906986446;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = ad1 < ad2;
    Output.points[8][2] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
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
    double ld0 = 161.13056998784091;
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
    Output.points[8][3] -= ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
        double ld1 = 354.7321713744984;
    ad1 *= -1;
    ad2 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    Thought lo3 = Thought353.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
    ad3 *= -1;
        lb2 = ad4 > fd0;
    fd1 *= -1;
    ld0 *= -1;
    ab1 = ld1 > ad1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought240.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought235.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[8][4] += fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    double ld2 = 223.46458638280026;
    fd0 *= -1;
    Output.points[8][5] -= fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ld2 = ao3.m3(fd0, fd1, ld2, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
          ad4 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
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
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[8][6] += fd0;
    fb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab4 = fb0 || fb1;
    ab1 = fd1 < fd0;
    ab2 = !ab3;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought18.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought385.getInstance();
        fd0 *= -1;
        boolean lb3 = true;
        fd1 = fd0 - fd1;
if(fo0 != null){
          ab3 = fo0.m2(ab4, fb0, fb1, lb3);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb3, lb0, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
        double ld4 = 27.050906715458982;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        boolean lb5 = false;
        boolean lb6 = true;
        boolean lb7 = false;
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought137.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[8][7] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    Output.points[8][8] += ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Thought lo2 = Thought142.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
    ab1 = ab2 && ab3;
    Thought lo3 = Thought82.getInstance(ao3, ao4, fo0, fo1);
    ad4 = fd0 - fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    ab4 = fb0 && fb1;
    lb1 = ab1 && ab2;
    Thought lo4 = Thought233.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo5 = Thought275.getInstance(ab3, ab4, fb0, fb1);
    boolean lb6 = false;
    lb1 = lb6 && ab1;
    Thought lo7 = Thought183.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    fb1 = lb1 || lb6;
    ab1 = ad2 < ad3;
    Thought lo8 = Thought215.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    ad2 = ad3 + ad4;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    double ld2 = 925.3831983079857;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought121.getInstance(fd1, ld2, fd0, fd1);
    double ld4 = 59.123721031089524;
    lb1 = ld2 < ld4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld4);
}
    Thought lo5 = Thought314.getInstance();
    fb1 = lb0 && lb1;
    boolean lb6 = false;
if(fo1 != null){
          fo1.m1(lb6, fb0, fb1, lb0);
}
    Output.points[0][0] -= fd0;
    boolean lb7 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld4, fd0, lb1, lb6, lb7, fb0);
}
    boolean lb8 = true;
    boolean lb9 = true;
if(fo0 != null){
      fd1 = fo0.m3(ld2, ld4, fd0, fd1, lb9, fb0, fb1, lb0);
}
    ld2 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[0][1] -= fd0;
    lb0 = fd1 > fd0;
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
    double ld2 = 361.15891662061983;
    Thought lo3 = Thought164.getInstance();
    double ld4 = 90.05354296071837;
    ld4 = fd0 + fd1;
    Thought lo5 = Thought15.getInstance(fb1, lb0, lb1, fb0);
    ld2 = ld4 + fd0;
    boolean lb6 = false;
    double ld7 = 778.3931197819036;
    double ld8 = 485.22301912589194;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld8, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    lb6 = fb0 || fb1;

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
    fb0 = !fb1;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 760.3638399264487;
    Output.points[0][2] += fd0;
    fd1 *= -1;
    fb1 = !fb0;
    double ld1 = 351.826673536381;
    Thought lo2 = Thought103.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ld0 > ld1;
    fd0 = fd1 + ld0;
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;

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
