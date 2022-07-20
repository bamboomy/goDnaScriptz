package genetic;
import java.util.ArrayList;
class Thought326 extends Thought{
private static ArrayList<Thought326> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 312.56567077757603;
private double fd1 = 679.8284097785036;
private Thought fo0 = null;
private Thought fo1 = null;
Thought326 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought326 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought326 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought326 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought326 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought326 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought326 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought326 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought326 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought326 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought326 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought326 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought326 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought326 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought326 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought326 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought326 instance = new Thought326 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought55.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 579.3056139432201;
    ld1 = fd0 - fd1;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1);
}
    Output.points[7][1] -= fd0;
    boolean lb3 = false;
    lb2 = !lb3;
    fb0 = fd1 > ld1;
    Thought lo4 = Thought54.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    fd1 *= -1;
    fb1 = lb2 || lb3;

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
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fd1 > fd0;
        fb1 = fd1 > fd0;
        Output.points[7][2] -= fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        fd0 *= -1;
        ab4 = fb0 || fb1;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
        ab2 = fd1 < fd0;
        double ld0 = 544.9819979579356;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
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
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    double ld0 = 505.72575289899316;
    fd0 = fd1 - ld0;
    Output.points[7][3] -= ad1;
    ad2 *= -1;
    fb0 = fb1 || fb0;
    ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2();
}
    lb1 = !fb0;
if(fo0 != null){
      ad3 = fo0.m3(fb1, lb1, fb0, fb1);
}
    lb1 = ad4 > fd0;
    fb0 = fb1 && lb1;

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
    Output.points[7][4] -= ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ab2 = !ab3;
    ad3 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    ab1 = ab2 && ab3;

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
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    Thought lo1 = Thought257.getInstance(fo1, ao1, ao2, ao3);
    fb0 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && fb0;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought241.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    boolean lb4 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(lb4, fb0, fb1, lb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb2, lb4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb5 = false;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb0, lb2, lb4, lb5);
}
    Thought lo6 = Thought320.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
    boolean lb7 = false;
    lb4 = fd0 < fd1;
        double ld8 = 665.8075520947808;

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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    fb0 = ad2 < ad3;
    Thought lo0 = Thought385.getInstance(ad4, fd0, fd1, ad1);
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3();
}
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought380.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
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
if(ao1 != null){
      ao1.m2();
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
        fb1 = fd0 < fd1;
        Thought lo0 = Thought102.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        fd0 *= -1;
        boolean lb1 = true;
        boolean lb2 = true;
        Thought lo3 = Thought139.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
        fd1 *= -1;
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb1, lb2, ab1, ab2);
}
        Thought lo4 = Thought202.getInstance(fo1, ao1, ao2, ao3);
        ab3 = ab4 && fb0;
if(ao4 != null){
          ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        fb1 = lb1 && lb2;
        double ld5 = 697.1829516191368;
        Thought lo6 = Thought221.getInstance();
        ld5 = fd0 - fd1;
        ab1 = ab2 && ab3;
        Output.points[7][5] += ld5;
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
    Thought lo0 = Thought272.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ad2 > ad3;
    ab1 = ad4 > fd0;
    Thought lo1 = Thought140.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    ad4 = fd0 + fd1;
    double ld2 = 222.63636504287552;
    ld2 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab4 = fb0 && fb1;
    boolean lb3 = true;
    ld2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb4 = false;

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
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        fb1 = fb0 || fb1;
        double ld0 = 727.8513552300549;
        Output.points[7][6] -= fd0;
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld0, fd0, fd1);
}
        double ld1 = 988.4449997466253;
        ld0 = ld1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
        }
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i1=0; i1<10; i1++){
        if (fb1) {
            Thought lo2 = Thought261.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
            double ld3 = 482.05628022917574;
            fb0 = ld3 > fd0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought30.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought90.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    Thought lo3 = Thought171.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
    ab1 = ab2 && ab3;
    double ld4 = 194.5589880494239;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
    lb2 = fd0 < fd1;
    lb5 = ab1 || ab2;
    boolean lb6 = true;
    ab2 = ab3 || ab4;
    boolean lb7 = false;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    double ld0 = 469.96235524387487;
    Thought lo1 = Thought266.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 163.74149083996107;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ad1, ad2);
}
    ad3 *= -1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3();
}
    fb0 = fb1 || lb3;
    fb0 = !fb1;
    lb3 = ld2 > ad1;
    fb0 = ad2 < ad3;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb3, lb4);
}
    fb0 = fb1 || lb3;
    ld2 *= -1;
    ad1 = ad2 + ad3;
    Thought lo5 = Thought205.getInstance(ad4, fd0, fd1, ld0, lb4, fb0, fb1, lb3);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb3);
}
    lb4 = ld2 < ad1;
    ad2 *= -1;

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
    boolean lb0 = true;
    Thought lo1 = Thought18.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ad1 < ad2;
    boolean lb2 = true;
    ab1 = ab2 || ab3;
    ab4 = ad3 > ad4;
    Output.points[7][7] -= fd0;
    fb0 = !fb1;
    lb0 = !lb2;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
    boolean lb3 = false;
    double ld4 = 660.7567763151302;
    double ld5 = 320.3982749771582;
    boolean lb6 = true;

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
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    Thought lo2 = Thought119.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 < fd0;
    Thought lo3 = Thought246.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
    fd1 *= -1;
    Thought lo4 = Thought98.getInstance(fo1, ao1, ao2, ao3);
    double ld5 = 416.49669336018945;
if(fo0 != null){
      ao4 = fo0.m4(ld5, fd0, fd1, ld5);
}
    Thought lo6 = Thought371.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld5, fd0);
    Thought lo7 = Thought234.getInstance();
    Thought lo8 = Thought127.getInstance(fb0, fb1, lb0, lb1);

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
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Output.points[7][8] += fd0;
        fd1 = ad1 + ad2;
        ad3 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought37.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
        ad4 = fd0 + fd1;
        Output.points[8][0] -= ad1;
        ad2 *= -1;
        fb0 = fb1 || fb0;
        double ld1 = 468.12925926277353;
if(ao3 != null){
          fb1 = ao3.m2();
}
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, fb0, fb1);
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
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld0 = 713.5956176042481;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    boolean lb2 = true;
    if (ab3) {
        ab4 = fd0 < fd1;
        fb0 = fb1 || lb1;
if(ao2 != null){
          ao2.m3(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
        lb2 = ab1 || ab2;
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          fo0.m3(ab3, ab4, fb0, fb1);
}
        lb1 = lb2 && ab1;
        ab2 = fd1 > ld0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = !fb0;
    boolean lb1 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
        boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = false;
    ab2 = ad3 < ad4;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb3, lb4, ab1, ab2);
}
    ab3 = ad4 < fd0;
if(ao4 != null){
      ao4.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought94.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 31.70005907060192;
if(fo1 != null){
      ld1 = fo1.m3();
}
    fd0 *= -1;
    fb1 = fd1 > ld1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fb0 = !fb1;
        }
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld1;
        if (fb0) {
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought261.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
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
    Output.points[8][1] -= ad1;
    fb0 = !fb1;
    Thought lo0 = Thought393.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    if (fb1) {
        boolean lb2 = false;
        lb2 = lb1 || fb0;
        fb1 = lb2 && lb1;
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 170.3916571143811;
    ab1 = ad2 > ad3;
    ab2 = ab3 || ab4;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought199.getInstance();
    Thought lo2 = Thought372.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    ld0 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo3 = Thought183.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ab4 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
    boolean lb4 = true;

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
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    lb1 = !lb2;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[8][2] -= fd0;
    fb0 = fd1 > fd0;

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
    boolean lb0 = true;
        lb0 = fb0 && fb1;
    ad1 = ad2 - ad3;
        lb0 = ad4 < fd0;
    Thought lo1 = Thought128.getInstance(fd1, ad1, ad2, ad3);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    double ld2 = 477.62385063232296;
    fb0 = fb1 && lb0;
    Output.points[8][3] += ad1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    Thought lo0 = Thought262.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld2 = 179.84198014046305;
    Thought lo3 = Thought153.getInstance(ld2, fd0, fd1, ld2);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
}
    ab1 = fd1 < ld2;

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
    ad1 *= -1;
if(ao2 != null){
      ao2.m3();
}
    ab1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    Output.points[8][4] -= ad1;
    ab3 = ad2 > ad3;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Thought lo1 = Thought147.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
        Thought lo2 = Thought303.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    if (fb1) {
        fd1 = fd0 + fd1;
        lb0 = fb0 || fb1;
        lb0 = fb0 && fb1;
        lb0 = !fb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 *= -1;
        } else {
        fd0 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
        double ld3 = 314.25672349855796;
                lb0 = fb0 && fb1;
        lb0 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
if(fo0 != null){
          fo0.m1();
}
        fd1 = ld3 + fd0;
        lb0 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        lb0 = fb0 || fb1;
        fd1 = ld3 + fd0;
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
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Output.points[8][5] += fd0;
    Output.points[8][6] += fd1;
    boolean lb1 = false;
    ab2 = fd0 < fd1;
    Thought lo2 = Thought321.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][7] += fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

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
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld0 = 779.1857052684568;
    fb0 = ad4 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    Thought lo1 = Thought138.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    fb0 = fb1 || fb0;
    fb1 = ad2 > ad3;

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
    ab1 = !ab2;
    double ld0 = 870.0841347264923;
if(fo1 != null){
      ld0 = fo1.m3();
}
    ab3 = ad1 > ad2;
    ad3 *= -1;
    boolean lb1 = false;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = ad3 > ad4;
    lb1 = !ab1;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1);
}
    ab2 = ad2 > ad3;
    double ld2 = 4.822017315709761;

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
    double ld0 = 81.72157519508454;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    fd1 = ld0 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ld0 - fd0;
    lb1 = fd1 > ld0;
    Thought lo3 = Thought131.getInstance(lb2, fb0, fb1, lb1);
    lb2 = fb0 || fb1;
        lb1 = fd0 > fd1;
    Output.points[8][8] -= ld0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
if(ao2 != null){
      ao2.m3(ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
    double ld4 = 267.6802046062947;
    lb1 = lb2 && fb0;

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
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    double ld0 = 602.0096151939765;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought352.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    double ld2 = 540.012333344412;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        fb0 = ld0 > ld2;
        boolean lb3 = false;
        fb0 = !fb1;
        Thought lo4 = Thought24.getInstance();
        Thought lo5 = Thought243.getInstance(lb3, fb0, fb1, lb3);
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb3, fb0);
}
        Thought lo6 = Thought373.getInstance(fd1, ld0, ld2, ad1, fb1, lb3, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 19.51387680180789;
    ld0 = fd0 - fd1;
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
if(ao3 != null){
      ab1 = ao3.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought22.getInstance(fd0, fd1, ld0, fd0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    ab4 = fd1 < ld0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < fd0;
    Output.points[0][0] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    double ld1 = 759.1886273620311;
    ab1 = ad3 > ad4;
    Thought lo2 = Thought3.getInstance(ao2, ao3, ao4, fo0);
    fd0 *= -1;
    fd1 = ld1 - ad1;
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;

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
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo2 = Thought40.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
    lb3 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb1, lb0, lb1, lb3);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought385.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    fd0 *= -1;
    Thought lo3 = Thought29.getInstance(fd1, fd0, fd1, fd0);
    Thought lo4 = Thought3.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      lb1 = fo1.m2();
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb5, fb0, fb1);
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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 416.94535449767545;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 833.3120160796631;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, fd0);
}
    Thought lo2 = Thought341.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
if(fo1 != null){
      fo1.m3();
}
    fb0 = fd1 < ld0;
    Thought lo3 = Thought387.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
    Output.points[0][1] -= fd0;
    double ld4 = 631.231783127977;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ld4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[0][2] += fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
    fb0 = ld1 < ld4;
    double ld5 = 660.6934312509422;

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
