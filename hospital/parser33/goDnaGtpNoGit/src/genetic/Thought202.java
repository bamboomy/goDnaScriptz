package genetic;
import java.util.ArrayList;
class Thought202 extends Thought{
private static ArrayList<Thought202> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 409.5157289177357;
private double fd1 = 186.42748598760437;
private Thought fo0 = null;
private Thought fo1 = null;
Thought202 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought202 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought202 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought202 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought202 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought202 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought202 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought202 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought202 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought202 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought202 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought202 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought202 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought202 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought202 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought202 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought202 instance = new Thought202 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 723.9253238159461;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 *= -1;
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || ab1;
    ab2 = fd0 < fd1;
    boolean lb0 = true;
    Thought lo1 = Thought389.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 257.26160698186624;
if(fo1 != null){
      ab1 = fo1.m2(ld2, fd0, fd1, ld2);
}
    ab2 = !ab3;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought362.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, ab1);
    Thought lo4 = Thought365.getInstance(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        double ld1 = 257.44100122257987;
        Output.points[1][5] -= ad4;
        fb0 = fb1 || lb0;
        boolean lb2 = false;
        lb2 = fb0 && fb1;
        lb0 = lb2 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
        double ld3 = 549.2256898769591;
        ad1 *= -1;
        Output.points[1][6] += ad2;
        boolean lb4 = true;
        fb0 = fb1 && lb0;
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
    fb1 = ab1 || ab2;
    Thought lo0 = Thought304.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought276.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    Output.points[1][7] -= ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
    Output.points[1][8] -= fd1;
    fb0 = fb1 || lb2;
    double ld3 = 88.88725114403069;

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
    fd0 = fd1 - fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 || fb0;
    fd0 *= -1;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought102.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought86.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    fb1 = fd1 > fd0;
    Thought lo3 = Thought186.getInstance();
    lb0 = fd1 < fd0;
    fd1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb4 = false;
    fd0 *= -1;

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
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
        boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (lb0) {
        double ld2 = 667.9565410006057;
        lb1 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
        double ld3 = 901.7634533159668;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ld2, ld3, ad1, ad2);
}
        Output.points[2][0] += ad3;
        lb0 = lb1 && fb0;
if(ao2 != null){
          ao2.m3();
}
if(ao3 != null){
          ad4 = ao3.m3(fb1, lb0, lb1, fb0);
}
        } else if (fb1) {
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
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[2][1] += fd0;
if(ao2 != null){
          ao2.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought213.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    double ld1 = 650.6203108612488;
    Output.points[2][2] -= fd0;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    ab1 = !ab2;
    double ld0 = 635.4590868156588;
    double ld1 = 510.7875116527607;
if(ao1 != null){
      ld1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    boolean lb3 = true;
    ab3 = !ab4;
    Thought lo4 = Thought312.getInstance(ld1, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
    if (ab1) {
        Output.points[2][3] -= ad4;
        Thought lo5 = Thought397.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
        fd0 = fd1 - ld0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ld1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ad1);
}
        fb1 = ad2 > ad3;
if(ao2 != null){
          ao2.m2();
}
        } else if (lb2) {
        boolean lb6 = true;
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
    Output.points[2][4] += fd1;
    Output.points[2][5] -= fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        if (fb0) {
            fb1 = fd1 > fd0;
            fb0 = fd1 > fd0;
            fb1 = fd1 < fd0;
            fd1 *= -1;
            fd0 = fd1 + fd0;
            boolean lb0 = true;
            Thought lo1 = Thought44.getInstance(lb0, fb0, fb1, lb0);
            fd1 = fd0 - fd1;
            fb0 = fb1 || lb0;
            Output.points[2][6] -= fd0;
            fb0 = fb1 || lb0;
            double ld2 = 891.1449908540799;
            } else if (fb1) {
            Thought lo3 = Thought315.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
            double ld4 = 806.8543303198373;
            fb0 = fb1 && fb0;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld4, fd0, fb1, fb0, fb1, fb0);
}
            fd1 = ld4 + fd0;
            Thought lo5 = Thought187.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fb1 = fd1 > ld4;
            Output.points[2][7] += fd0;
            Thought lo6 = Thought212.getInstance(fd1, ld4, fd0, fd1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[2][8] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    fd0 *= -1;
    fd1 *= -1;
    ab3 = ab4 && fb0;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb1 = !ab1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    double ld3 = 304.5058062871055;
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    boolean lb4 = false;
    ld3 = fd0 + fd1;
    double ld5 = 547.1720573270745;

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
    Output.points[3][0] += ad1;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
        fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[3][1] -= ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought21.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
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
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        ad1 *= -1;
    ad2 = ad3 + ad4;
    fb1 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        Thought lo0 = Thought82.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
        ab1 = ab2 && ab3;
        ab4 = ad1 > ad2;
        fb0 = ad3 < ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ad1;
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0);
}
        ab4 = !fb0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4();
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
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[3][2] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
        double ld0 = 823.4461749469223;
        fd0 *= -1;
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
    fb1 = ad1 < ad2;
    boolean lb0 = true;
    double ld1 = 71.96241245955432;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao3 != null){
      lb0 = ao3.m2(lb2, fb0, fb1, lb0);
}
    double ld3 = 306.89174592549614;
    double ld4 = 549.0974514193164;
    ad1 = ad2 - ad3;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
    ld3 = ld4 - ad1;
    ad2 = ad3 + ad4;

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
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought103.getInstance(ao3, ao4, fo0, fo1);
    lb0 = ab1 && ab2;
if(ao1 != null){
      ab3 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
        boolean lb2 = true;
    boolean lb3 = false;
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb2 = lb3 && ab1;
    boolean lb4 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought104.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    for(int i0=0; i0<10; i0++){
        double ld1 = 412.43045478841367;
        fb1 = ld1 > ad1;
        Thought lo2 = Thought229.getInstance(fo0, fo1, ao1, ao2);
        ab1 = ad2 < ad3;
        boolean lb3 = true;
        double ld4 = 717.9281177147033;
        boolean lb5 = false;
        ad3 *= -1;
        Thought lo6 = Thought192.getInstance(ad4, fd0, fd1, ld1);
        ld4 *= -1;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought138.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        lb0 = fd1 < fd0;
        double ld2 = 596.9685955510332;
if(fo0 != null){
          fo0.m1();
}
        fd0 = fd1 + ld2;
        boolean lb3 = false;
        lb0 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb3, lb0, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb3, lb0, fb0);
}
        double ld4 = 586.1579642610237;
if(fo0 != null){
          ld2 = fo0.m3(ld4, fd0, fd1, ld2, fb1, lb3, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, lb0, fb0);
}
        ld4 *= -1;
        fd0 = fd1 + ld2;
        fb1 = ld4 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo5 = Thought239.getInstance(ld2, ld4, fd0, fd1);
        lb3 = ld2 < ld4;
        boolean lb6 = false;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    Thought lo0 = Thought267.getInstance();
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    Thought lo2 = Thought198.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
    if (ab3) {
        Output.points[3][3] += fd0;
if(fo0 != null){
          ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
        double ld3 = 605.1495564285324;
        fd0 = fd1 + ld3;
        ab2 = fd0 > fd1;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
        ld3 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab1 = ab2 || ab3;
        ab4 = ld3 < fd0;
        fb0 = fb1 && lb1;
        double ld4 = 458.24837738494745;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, ld4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;

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
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    ab4 = !fb0;
    Thought lo1 = Thought11.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
    ab3 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld3 = 48.80899637280692;
if(fo0 != null){
      ld3 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Output.points[3][4] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb2, ab1, ab2);
}
    boolean lb4 = false;
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld3, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    lb0 = !lb2;
    lb4 = fd1 > ld3;
    ad1 = ad2 + ad3;
    double ld5 = 991.0607743258159;
    Output.points[3][5] += ad3;

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
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 232.8847106308065;
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 52.3090325950744;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m1(ld1, fd0, fd1, ld0);
}
    lb2 = fb0 && fb1;
    double ld3 = 491.9497865382765;
    ld1 = ld3 - fd0;
    lb2 = fb0 || fb1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
    fb1 = ad2 < ad3;
    fb0 = fb1 && fb0;
    double ld0 = 659.3892556431604;
    double ld1 = 4.402539573483913;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought328.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
        Output.points[3][6] += fd0;
        ab4 = fb0 || fb1;
        ab1 = !ab2;
        boolean lb1 = true;
        ab2 = fd1 < fd0;
        double ld2 = 372.36789341670726;
        ab3 = ab4 && fb0;
        fb1 = lb1 && ab1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought78.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Thought lo4 = Thought260.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    double ld5 = 516.4252677680911;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
        double ld0 = 393.2186700688248;
        Output.points[3][7] += ad1;
        boolean lb1 = true;
        double ld2 = 898.2088568336318;
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 + ld0;
        double ld3 = 251.92107538167457;
        boolean lb4 = true;
        if (lb1) {
            lb4 = ld2 > ld3;
            double ld5 = 396.3059418086639;
            ab1 = !ab2;
            double ld6 = 212.29629351760693;
if(ao2 != null){
              ab3 = ao2.m2(ld2, ld3, ad1, ad2);
}
            Thought lo7 = Thought113.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
            boolean lb8 = true;
            ld5 = ld6 + ld0;
            ld2 *= -1;
if(ao2 != null){
              ao1 = ao2.m4();
}
            ab3 = ld3 < ad1;
            } else {
if(ao4 != null){
              ao3 = ao4.m4(fb0, fb1, lb1, lb4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought357.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
    lb1 = fd1 > fd0;
    if (fb0) {
        fb1 = fd1 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        boolean lb2 = true;
        Thought lo3 = Thought306.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        Output.points[3][8] += fd1;
        lb2 = !lb1;
        } else {
        boolean lb4 = true;
        fd0 *= -1;
        double ld5 = 449.54872117977925;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = fb1 || lb4;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb4);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = !ab1;
    double ld0 = 628.1966353630377;
    fd0 *= -1;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 > fd0;
    ab1 = !ab2;
    boolean lb1 = false;
    ab2 = ab3 && ab4;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    ad4 *= -1;
if(fo0 != null){
      lb0 = fo0.m2();
}
    fb0 = fb1 || lb0;
    fd0 *= -1;
    fb0 = fb1 || lb0;
    fb0 = fd1 < ad1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought267.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
    ab2 = ab3 || ab4;
    if (fb0) {
        ad1 = ad2 - ad3;
        ad4 *= -1;
        double ld0 = 229.82986847513286;
        double ld1 = 855.499996321119;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb1 = !ab1;
        ld0 = ld1 - ad1;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought216.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        fd0 = fd1 + fd0;
    Output.points[4][0] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        fb1 = fd0 > fd1;
        lb0 = fd0 < fd1;
        fd0 *= -1;
        fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        Thought lo2 = Thought336.getInstance(fb0, fb1, lb0, fb0);
        for(int i1=0; i1<10; i1++){
            }
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    ad1 *= -1;
    fb0 = fb1 || lb0;
    Output.points[4][1] += ad2;
    double ld1 = 370.3025549479624;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld2 = 820.3889302752408;
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    Output.points[4][2] += ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought24.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
    Output.points[4][3] -= ld2;
    ad1 = ad2 + ad3;
        Thought lo4 = Thought135.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[4][4] += ad4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld1, ld2, ad1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fd1 = ld1 + ld2;

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
        ab2 = fd0 < fd1;
    ab3 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb0 = false;
    double ld1 = 855.7742326772188;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    Output.points[4][5] += fd1;
            lb0 = ab1 && ab2;

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
    ad1 = ad2 + ad3;
    ab2 = ad4 > fd0;
        fd1 *= -1;
    ab3 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Output.points[4][6] += fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought382.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ab4 = !fb0;
    ad1 = ad2 - ad3;

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
    fb1 = !fb0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 566.4807702288739;
    boolean lb2 = true;
    lb2 = fd0 > fd1;
    fb0 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb1, lb0, lb2, fb0);
}
    fd1 *= -1;
    fb1 = lb0 && lb2;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    fb0 = fd1 < ld1;
    fb1 = lb0 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought98.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
    fd1 = ld1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought254.getInstance(fd1, ld1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo5 = Thought35.getInstance();
    boolean lb6 = false;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, lb2);
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
    fd0 = fd1 - fd0;
    Output.points[4][7] -= fd1;
    fb0 = fd0 > fd1;
    Output.points[4][8] -= fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought34.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        Thought lo1 = Thought338.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][0] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[5][1] += fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fd0 = fd1 - fd0;

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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought138.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 379.4410585712622;
    Thought lo2 = Thought342.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    boolean lb3 = true;
        Thought lo4 = Thought27.getInstance(fd1, ld1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    Thought lo5 = Thought206.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(lb3, fb0, fb1, lb3);
}
    fb0 = fd1 > ld1;

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
