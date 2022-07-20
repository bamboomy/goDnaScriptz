package genetic;
import java.util.ArrayList;
class Thought366 extends Thought{
private static ArrayList<Thought366> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 460.73398135406694;
private double fd1 = 816.9697150614916;
private Thought fo0 = null;
private Thought fo1 = null;
Thought366 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought366 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought366 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought366 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought366 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought366 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought366 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought366 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought366 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought366 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought366 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought366 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought366 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought366 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought366 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought366 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought366 instance = new Thought366 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 < fd1;
    double ld0 = 148.81299425892425;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        fb0 = fb1 || fb0;
            fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    boolean lb1 = true;
if(fo0 != null){
      ld0 = fo0.m3();
}
    fd0 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
    double ld3 = 686.7452552267019;
    Thought lo4 = Thought200.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought42.getInstance(fd0, fd1, ld0, ld3);
    fb0 = fd0 < fd1;
    fb1 = ld0 < ld3;

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
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    double ld1 = 160.34126499183154;
    fd0 = fd1 + ld1;
    boolean lb2 = false;
    boolean lb3 = false;

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
    Output.points[5][4] -= ad2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[5][5] += fd1;
        fb1 = fb0 && fb1;
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        boolean lb0 = false;
        Output.points[5][6] += fd1;
        fb0 = ad1 < ad2;
        boolean lb1 = true;
        ad3 = ad4 - fd0;
        fb0 = fd1 < ad1;
        if (fb1) {
            Thought lo2 = Thought171.getInstance(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
            lb0 = !lb1;
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb1 = fd1 > ad1;
if(fo1 != null){
          lb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 939.5716706493639;
    fd0 *= -1;
    boolean lb1 = true;
    Output.points[5][7] += fd1;
if(ao3 != null){
      fb0 = ao3.m2(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    lb1 = !lb2;
    if (fb0) {
        double ld3 = 782.1577607572041;
        double ld4 = 187.14433024230146;
        Thought lo5 = Thought165.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, lb2, fb0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = lb1 || lb2;
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
    double ld0 = 718.7995819948823;
    fb0 = fb1 && fb0;
if(ao2 != null){
          fb1 = ao2.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + ld0;
    ad1 *= -1;
    fb1 = fb0 || fb1;
    Output.points[5][8] -= ad2;
    ad3 *= -1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought169.getInstance();
    fb1 = ad4 > fd0;
    fd1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad1 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab4 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        if (fb0) {
        boolean lb2 = false;
        boolean lb3 = true;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
        double ld4 = 691.8044664586855;
        fd0 = fd1 + ld4;
        for(int i0=0; i0<10; i0++){
            ab4 = fb0 && fb1;
            fd0 = fd1 + ld4;
            fd0 *= -1;
            lb2 = fd1 > ld4;
            Thought lo5 = Thought347.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld4, fd0);
if(ao1 != null){
              fo1 = ao1.m4();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    double ld0 = 458.6758705150061;
    double ld1 = 551.5545219758147;
    ab2 = ab3 || ab4;
    ld1 *= -1;
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, ab1, ab2);
}
    ab3 = ad2 > ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = ab1 && ab2;
    double ld2 = 784.412747661305;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, ld2, ad1, ad2);
}
    ab1 = ab2 && ab3;
    ad3 = ad4 + fd0;
    double ld3 = 958.87559140769;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1);
}
    ld2 = ld3 - ad1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    Output.points[6][0] -= ld1;
    boolean lb4 = true;
if(ao2 != null){
      ld2 = ao2.m3(ab3, ab4, fb0, fb1);
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 6.358633954034265;
    double ld1 = 798.4314935544398;
    Output.points[6][1] -= ld0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought1.getInstance(fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
    ab4 = !fb0;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought234.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought84.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld3 = 668.8012617457156;
    double ld4 = 686.1809033261354;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb5 = true;

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
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    Output.points[6][2] += ad3;
    ad4 *= -1;

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
    boolean lb0 = false;
if(fo1 != null){
      ad1 = fo1.m3();
}
    Thought lo1 = Thought120.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Output.points[6][3] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    boolean lb2 = false;

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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought281.getInstance();
    fb1 = fd1 < fd0;
    Output.points[6][4] += fd1;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fd0 *= -1;
        Thought lo1 = Thought21.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
        fb1 = fd1 < fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][5] += ad2;
    ad3 *= -1;
    fb0 = ad4 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    double ld0 = 226.78739840320125;
    ld0 = ad1 + ad2;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;

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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld1 = 675.8057662495871;
    double ld2 = 963.4159448890415;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    ld2 *= -1;
    ab4 = !fb0;
    fb1 = lb0 || ab1;
    double ld3 = 293.1495840900842;
    ld3 = fd0 + fd1;
    boolean lb4 = false;
    ab1 = ab2 && ab3;

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
    Thought lo0 = Thought252.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    double ld1 = 71.9547878534482;
    ad3 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + ld1;
    Thought lo2 = Thought225.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld1;
    ab4 = fb0 && fb1;
    ad1 *= -1;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb3 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        boolean lb4 = true;
        fd1 = ld1 + ad1;
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
      fo1.m3();
}
    double ld0 = 572.7090802105033;
    ld0 = fd0 + fd1;
    ld0 *= -1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ld0 = fd0 - fd1;
    double ld1 = 172.65931985114264;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
            boolean lb2 = true;
    fd1 *= -1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
    Output.points[6][6] += fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
        fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
    Thought lo0 = Thought164.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    Output.points[6][7] -= ad4;
    double ld1 = 648.4042600147269;
    fb0 = fb1 && fb0;
    fb1 = ad4 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
        fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    boolean lb2 = true;
    Thought lo3 = Thought227.getInstance(fo1, fo0, fo1, fo0);

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
      fo1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld0 = 500.6626478306447;
    Output.points[6][8] += ld0;
if(fo1 != null){
      fo1.m3();
}
    double ld1 = 190.12043673832105;
if(fo0 != null){
      ld1 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ld0 *= -1;
    ld1 = ad1 - ad2;
        boolean lb2 = true;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought7.getInstance(fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    fb0 = fb1 || lb0;
    Output.points[7][0] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought218.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    lb0 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        lb0 = fb0 && fb1;
        ad2 = ad3 - ad4;
        Thought lo1 = Thought33.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
        fb0 = !fb1;
        lb0 = fb0 || fb1;
        lb0 = fb0 || fb1;
        double ld2 = 252.06193954058492;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 625.6837952826896;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    Output.points[7][1] -= ld0;
    boolean lb2 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;

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
    ab2 = ad3 > ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
    ab3 = !ab4;
    ad4 = fd0 + fd1;
    Output.points[7][2] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    Output.points[7][3] -= ad2;
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = ad3 < ad4;
        fd0 = fd1 - ad1;
        boolean lb0 = true;
        double ld1 = 187.27645793161108;
        lb0 = ad1 > ad2;
        ab1 = ab2 && ab3;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought118.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    fb0 = !fb1;
        lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought127.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb3 = true;
    lb1 = fd1 < fd0;
    double ld4 = 33.98796663443233;
if(fo1 != null){
      fo1.m3();
}
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, lb3, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, fb1, lb1, lb3, fb0);
}
    double ld5 = 578.7312237302822;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ld4, ld5, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb3, fb0, fb1);
}
    double ld6 = 924.4585984367654;
    boolean lb7 = false;
    Output.points[7][4] += ld4;

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
    Output.points[7][5] += fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    lb0 = !ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    Output.points[7][6] += fd1;
    fd0 *= -1;
    Thought lo1 = Thought313.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    fd1 = fd0 + fd1;
    Output.points[7][7] += fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
    Output.points[7][8] += fd1;
    double ld0 = 715.8872011633647;
    Output.points[8][0] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought100.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    double ld2 = 857.0985471328447;
    ld0 *= -1;
    fb1 = ld2 < ad1;
    boolean lb3 = true;
    double ld4 = 676.8822205246219;
    lb3 = ad1 < ad2;
    Thought lo5 = Thought45.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ld4, ad1, lb3, fb0, fb1, lb3);
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
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld0 = 507.96658750566974;
    double ld1 = 563.698676022824;
    ab1 = ad1 > ad2;
    ad3 *= -1;
        ab2 = ad4 < fd0;
    Output.points[8][1] -= fd1;
        boolean lb2 = true;

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
    double ld0 = 900.9898758453205;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (fb1) {
if(ao2 != null){
          ao2.m3(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
        } else if (fb0) {
        fb1 = fd1 < ld0;
        fd0 = fd1 - ld0;
        fd0 *= -1;
        Output.points[8][2] += fd1;
        fb0 = fb1 && fb0;
        } else {
if(ao4 != null){
          ao3 = ao4.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad4 *= -1;
    fb1 = fb0 && fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    fb1 = !fb0;
    Thought lo0 = Thought306.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
    fd0 *= -1;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fd1 = ad1 - ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    double ld1 = 248.62387849190623;
    ab3 = ld1 > fd0;
    boolean lb2 = true;
        Thought lo3 = Thought379.getInstance();
    ab3 = fd1 > ld1;
    Thought lo4 = Thought239.getInstance(ab4, fb0, fb1, lb0);
    fd0 = fd1 + ld1;

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
    Thought lo0 = Thought367.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought236.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought359.getInstance(fd0, fd1, ad1, ad2);
    ab3 = ab4 && fb0;
    Thought lo3 = Thought235.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld4 = 51.26766543483428;
if(ao3 != null){
      ao3.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ld4 = ad1 - ad2;
    Thought lo5 = Thought4.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao2.m2(ld4, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld4);
}
    double ld6 = 996.7626098390227;
    Output.points[8][3] += ld6;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 + ld4;
    ab1 = ab2 && ab3;

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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 120.40780147645786;
    fb0 = fb1 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    Output.points[8][4] += fd1;
    Output.points[8][5] -= ld0;
    fd0 *= -1;
    Thought lo3 = Thought238.getInstance(fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
    double ld4 = 129.00782939933785;
    ld0 = ld4 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld4, fd0);
}
    fd1 = ld0 + ld4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(lb1, lb2, fb0, fb1);
}
        lb1 = fd1 < ld0;

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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought157.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought283.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    double ld2 = 59.826778359762194;
    Thought lo3 = Thought97.getInstance();
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = ld2 < fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought184.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
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
}
