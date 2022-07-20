package genetic;
import java.util.ArrayList;
class Thought295 extends Thought{
private static ArrayList<Thought295> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 596.5892246226358;
private double fd1 = 105.57702621934074;
private Thought fo0 = null;
private Thought fo1 = null;
Thought295 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought295 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought295 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought295 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought295 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought295 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought295 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought295 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought295 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought295 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought295 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought295 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought295 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought295 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought295 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought295 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought295 instance = new Thought295 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought293.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[1][5] += fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fb1 || fb0;
        Thought lo1 = Thought174.getInstance(fo0, fo1, fo0, fo1);
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
        Output.points[1][6] += fd0;
        Thought lo2 = Thought392.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 && fb0;
        boolean lb3 = false;
        if (fb0) {
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought276.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    lb2 = ab1 || ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;

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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought144.getInstance();
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb2, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, lb2, fb0, fb1);
}
    Output.points[1][7] -= ad4;
    boolean lb3 = true;
    lb0 = fd0 > fd1;
    lb2 = !lb3;
    ad1 = ad2 - ad3;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb4, fb0, fb1, lb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb2, lb3, lb4, fb0);
}
    Thought lo5 = Thought217.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    double ld0 = 135.7984507729581;
    boolean lb1 = true;
    if (ab1) {
        double ld2 = 243.52431172760123;
        ld2 = ld0 + ad1;
        if (ab2) {
if(fo0 != null){
              ad2 = fo0.m3();
}
            ad3 = ad4 - fd0;
            fd1 = ld2 - ld0;
            boolean lb3 = true;
            ab2 = ab3 && ab4;
            Output.points[1][8] += ad1;
if(fo1 != null){
              fo1.m3(fb0, fb1, lb3, lb1);
}
            Thought lo4 = Thought231.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld2, ld0, ad1, fb0, fb1, lb3, lb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              fo1.m1(ad3, ad4, fd0, fd1);
}
            fb0 = fb1 && lb3;
            double ld5 = 628.4268493113034;
            ld5 = ld2 - ld0;
            lb1 = ab1 && ab2;
            ab3 = ab4 && fb0;
            fb1 = ad1 < ad2;
if(fo0 != null){
              ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld5);
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
    boolean lb0 = false;
    Output.points[2][0] -= fd1;
    Output.points[2][1] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 *= -1;
    double ld1 = 418.6829195450134;
    ld1 = fd0 + fd1;
    fb0 = ld1 < fd0;
    double ld2 = 289.9441333797249;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][2] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought106.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Output.points[2][3] += ad3;
    fb1 = fb0 || fb1;
    Output.points[2][4] += ad4;
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 || fb0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m2(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ad1;
        fb1 = !fb0;
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
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab3 = fd0 < fd1;
    ab4 = fd0 > fd1;
if(ao3 != null){
      fb0 = ao3.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 386.454355084893;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        }
    ab4 = !fb0;
    fb1 = fd1 < fd0;

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
    Output.points[2][5] -= ad2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
    fd1 *= -1;
    Output.points[2][6] -= ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 785.9145044891535;
    if (ab1) {
if(ao2 != null){
          ao1 = ao2.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        ad4 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ld0, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        Thought lo1 = Thought205.getInstance(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        ad4 = fd0 + fd1;
if(ao3 != null){
          ao3.m3();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
        boolean lb2 = true;
        ld0 *= -1;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[2][7] -= fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 463.13837896917823;
    Thought lo1 = Thought18.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fd0 = fd1 + ld0;
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought336.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb2, fb0, fb1);
        ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    double ld4 = 292.09740385827865;
if(fo0 != null){
      ld0 = fo0.m3(ld4, fd0, fd1, ld0);
}
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld0);
}
    lb2 = ld4 < fd0;

Thought.STACK_COUNTER++;
return lb5;
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
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld1 = 978.8636953226393;
    boolean lb2 = false;
    ab1 = !ab2;

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
    Thought lo0 = Thought127.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    if (fb0) {
        fb1 = lb1 || fb0;
        fd1 = ad1 + ad2;
        boolean lb2 = false;
        fb0 = fb1 && lb2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb2);
}
        boolean lb3 = true;
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb2);
}
        lb3 = ad1 < ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb1 = fb0 || fb1;
if(fo1 != null){
          lb2 = fo1.m2(ad3, ad4, fd0, fd1);
}
        if (lb3) {
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
            fd0 = fd1 + ad1;
            ad2 = ad3 - ad4;
            fd0 *= -1;
            boolean lb4 = true;
if(fo1 != null){
              fd1 = fo1.m3(lb3, lb1, fb0, fb1);
}
            boolean lb5 = false;
            double ld6 = 267.86246071461136;
            boolean lb7 = false;
            boolean lb8 = true;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ld6, ad1, ad2, ad3, lb4, lb5, lb7, lb8);
}
            double ld9 = 619.5345117116968;
            boolean lb10 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ad1 > ad2;
    ad3 *= -1;
    boolean lb0 = false;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    Output.points[2][8] += ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    double ld0 = 690.0914274343669;
    fb1 = !fb0;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m2();
}
    double ld1 = 200.0044907795866;
    fb0 = !fb1;
    boolean lb2 = false;
    lb2 = ld0 > ld1;
    Output.points[3][0] += fd0;
    boolean lb3 = true;
    fd1 = ld0 + ld1;
    Thought lo4 = Thought269.getInstance(lb3, fb0, fb1, lb2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb2);
}
    lb3 = fb0 && fb1;
if(ao2 != null){
      lb2 = ao2.m2(fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return lb3;
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
    Output.points[3][1] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    Output.points[3][2] += ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought38.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    double ld2 = 382.60882593154;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought379.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld2, ad1, ad2);
}
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2);
}
    ad1 *= -1;
    lb1 = fb0 && fb1;
if(ao3 != null){
      lb1 = ao3.m2();
}
    Thought lo4 = Thought399.getInstance(fb0, fb1, lb1, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    double ld5 = 534.475289271213;
    fd0 = fd1 - ld2;

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
if(ao2 != null){
      ab2 = ao2.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[3][3] += fd1;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    double ld2 = 824.3159557475905;
    ab3 = ab4 && fb0;
    ld2 = fd0 - fd1;

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
    ab1 = ad1 > ad2;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought323.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ab3 = ao4.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    Output.points[3][4] -= ad2;
if(ao4 != null){
      ad3 = ao4.m3();
}
    Thought lo1 = Thought88.getInstance(ab4, fb0, fb1, ab1);
    double ld2 = 28.238160314166386;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld3 = 501.32000411014815;
    Output.points[3][5] -= ld2;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(ld3, ad1, ad2, ad3, fb0, fb1, lb4, ab1);
}
    ad4 = fd0 + fd1;
    ld2 = ld3 - ad1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            Output.points[3][6] += ad2;
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld0 = 535.961742358385;
    fb0 = !fb1;
    Output.points[3][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought151.getInstance(fb0, fb1, fb0, fb1);
    Thought lo2 = Thought217.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb3 = false;
    boolean lb4 = true;
    Output.points[3][8] += ld0;
    Output.points[4][0] += fd0;

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
    Output.points[4][1] -= fd0;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    Output.points[4][2] += fd0;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    Output.points[4][3] -= fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 529.6882276748385;
    double ld1 = 525.0538039364562;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;
    Output.points[4][4] -= fd0;
    double ld2 = 276.2319412830215;
    boolean lb3 = true;
    ab2 = ab3 || ab4;
    Output.points[4][5] += fd0;

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
    Thought lo0 = Thought332.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
    Thought lo1 = Thought83.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    Thought lo0 = Thought293.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    Output.points[4][6] += fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought390.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought285.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
    Output.points[4][7] += ad4;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 = ad1 + ad2;
    lb1 = ad3 < ad4;
    double ld4 = 635.6271458413984;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld4);
}
    ab4 = fb0 || fb1;
    lb1 = ad1 < ad2;
    Thought lo5 = Thought309.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2();
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
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[4][8] -= fd0;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    Output.points[5][0] += fd0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;

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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        Thought lo0 = Thought271.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        Thought lo1 = Thought138.getInstance(ad3, ad4, fd0, fd1);
        double ld2 = 269.24427089937006;
        boolean lb3 = true;
        Thought lo4 = Thought325.getInstance(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
        boolean lb5 = true;
if(ao4 != null){
          lb5 = ao4.m2();
}
if(fo0 != null){
          fo0.m2(fb0, fb1, lb3, lb5);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, fb0, fb1, lb3, lb5);
}
            if (fb0) {
if(fo0 != null){
                  fo0.m3(ad1, ad2, ad3, ad4, fb1, lb3, lb5, fb0);
}
if(fo1 != null){
                  fb1 = fo1.m2(ao1, ao2, ao3, ao4, lb3, lb5, fb0, fb1);
}
                lb3 = !lb5;
}}}
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
    ab1 = !ab2;
    Output.points[5][1] += fd0;
    double ld0 = 924.9732493204017;
        Thought lo1 = Thought317.getInstance(ao1, ao2, ao3, ao4);
    boolean lb2 = false;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    boolean lb3 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1();
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb1, lb2, lb3, ab1);
}
    ab2 = ab3 && ab4;

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
    ad2 *= -1;
    ad3 *= -1;
    ab1 = ab2 && ab3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought159.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
    ad4 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    Thought lo4 = Thought217.getInstance();
if(ao1 != null){
      lb0 = ao1.m2(lb2, lb3, ab1, ab2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 812.3919820751585;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    double ld1 = 487.32980546265037;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > ld1;
    double ld2 = 229.32005736929406;
    Thought lo3 = Thought180.getInstance(ld2, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought73.getInstance(fo1, fo0, fo1, fo0);
    ab1 = ab2 || ab3;
    Thought lo1 = Thought339.getInstance(fd1, fd0, fd1, fd0);
    ab4 = fd1 < fd0;
    Thought lo2 = Thought224.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    double ld3 = 380.6987304021055;
if(fo1 != null){
      fo1.m1();
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, lb4);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb4, ab1);
}
    boolean lb5 = true;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld3;
    lb4 = lb5 && ab1;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    fb0 = ld3 > fd0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
        Output.points[5][2] += ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m3();
}
        fb1 = ad4 < fd0;
        double ld1 = 314.6271297215593;
        Output.points[5][3] -= fd0;
        lb0 = !fb0;
        fb1 = lb0 && fb0;
        Thought lo2 = Thought177.getInstance(fb1, lb0, fb0, fb1);
        lb0 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    double ld2 = 580.6608888739452;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    Thought lo3 = Thought366.getInstance(fb0, fb1, lb0, lb1);
    ad4 = fd0 + fd1;
    Thought lo4 = Thought295.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld2, ad1, ad2, ad3, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[5][4] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
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
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld0 = 493.6336254961622;
    Thought lo1 = Thought10.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = ad2 < ad3;
    boolean lb2 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld0, ad1);
}
    Thought lo3 = Thought155.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    Thought lo4 = Thought55.getInstance();
    fb1 = fd1 > ld0;
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb2);
}
    boolean lb5 = true;
    lb5 = ad1 < ad2;
    ad3 *= -1;

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
    if (ab1) {
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        double ld0 = 464.5732225444207;
        ab1 = ld0 > fd0;
        } else if (ab2) {
        Thought lo1 = Thought24.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        ab2 = ab3 || ab4;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        fb0 = fd1 < fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 937.4543932902961;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m3();
}
    boolean lb1 = false;
    Thought lo2 = Thought52.getInstance(lb1, ab1, ab2, ab3);
    Thought lo3 = Thought194.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
    boolean lb4 = true;
    ad1 *= -1;
    lb4 = ad2 > ad3;
    ab1 = ad4 < fd0;
    Thought lo5 = Thought111.getInstance(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, lb1, lb4, ab1, ab2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
}
    Output.points[5][5] -= ad1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, lb4, ab1);
}
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
    Thought lo6 = Thought18.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, fb0, fb1, lb1, lb4);
    ab1 = !ab2;
    Thought lo7 = Thought99.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    Thought lo8 = Thought136.getInstance(fo1, ao1, ao2, ao3, lb1, lb4, ab1, ab2);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 = ld0 + ad1;
    boolean lb9 = false;

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
        Thought lo0 = Thought373.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 371.8573019030405;
    boolean lb2 = false;
    ld1 *= -1;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    ld1 *= -1;
    Output.points[5][6] += fd0;
    Output.points[5][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
    boolean lb3 = false;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
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
    Thought lo0 = Thought182.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[5][8] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought243.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[6][0] += fd0;
    fb0 = !fb1;
    Output.points[6][1] += fd1;

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
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fd0 < fd1;
    Output.points[6][2] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    lb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, fb0, fb1);
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
