package genetic;
import java.util.ArrayList;
class Thought330 extends Thought{
private static ArrayList<Thought330> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 572.1792235238571;
private double fd1 = 13.978843565023894;
private Thought fo0 = null;
private Thought fo1 = null;
Thought330 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought330 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought330 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought330 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought330 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought330 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought330 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought330 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought330 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought330 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought330 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought330 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought330 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought330 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought330 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought330 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought330 instance = new Thought330 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        boolean lb0 = true;
        fd1 = fd0 + fd1;
        } else {
        Output.points[2][5] -= fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb1 = false;
        boolean lb2 = true;
        double ld3 = 962.6869793152975;
        Output.points[2][6] -= ld3;
        fd0 = fd1 - ld3;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld3, fd0, fd1);
}
        lb2 = fb0 && fb1;
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
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
        ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;

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
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        Output.points[2][7] += ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        ad1 = ad2 + ad3;
        ad4 *= -1;
        double ld0 = 950.0801291236069;
        Thought lo1 = Thought211.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought235.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
        fd1 = ld0 - ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad2 *= -1;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
        fb1 = ad1 < ad2;
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
    boolean lb0 = true;
    Output.points[2][8] += ad2;
    lb0 = ab1 || ab2;
    ab3 = ad3 > ad4;
    fd0 *= -1;
    double ld1 = 641.9349789016485;
    ab4 = fb0 && fb1;
    fd0 = fd1 + ld1;
    lb0 = ad1 > ad2;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Output.points[3][0] -= fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 78.11284194511347;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
        boolean lb2 = true;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao2.m3(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    if (lb2) {
        ld0 = fd0 + fd1;
        Output.points[3][1] += ld0;
        fb0 = fb1 && lb1;
        lb2 = fd0 > fd1;
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
        fb0 = fb1 || lb1;
        lb2 = fd0 > fd1;
        fb0 = !fb1;
        ld0 = fd0 + fd1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld0 = 874.4167224406538;
    Thought lo1 = Thought136.getInstance();
    Thought lo2 = Thought100.getInstance(fb1, fb0, fb1, fb0);
    double ld3 = 340.1183571810813;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            fb0 = fb1 || fb0;
            Output.points[3][2] += ld0;
            Thought lo4 = Thought91.getInstance(ao2, ao3, ao4, fo0, ld3, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
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
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    Thought lo1 = Thought83.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    ab2 = ab3 || ab4;
    Thought lo2 = Thought216.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
    fd1 *= -1;
    Output.points[3][3] += fd0;
    boolean lb3 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    ad1 *= -1;
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    ab1 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m2();
}
    Thought lo2 = Thought335.getInstance(ab2, ab3, ab4, fb0);
    Output.points[3][4] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought59.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, lb1, ab1);

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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[3][5] += fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Output.points[3][6] -= fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought295.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    double ld1 = 381.09423236604914;
    ld1 *= -1;
    Thought lo2 = Thought309.getInstance();
    fd0 = fd1 + ld1;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    double ld3 = 276.3786074489645;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
        ld1 = ld3 - fd0;
if(fo0 != null){
      ab2 = fo0.m2(fd1, ld1, ld3, fd0);
}
    Output.points[3][7] -= fd1;
    boolean lb5 = true;
    ab2 = ld1 > ld3;

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
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    double ld0 = 388.86670181196297;
    Thought lo1 = Thought38.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
    double ld2 = 362.1753008005538;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;

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
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        double ld0 = 368.8813697608066;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        ad3 *= -1;
        boolean lb1 = true;
        ad4 = fd0 - fd1;
        Output.points[3][8] -= ld0;
        fb0 = !fb1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        ab1 = ad3 < ad4;
        fd0 = fd1 - ld0;
        ab2 = ad1 > ad2;
        ab3 = ab4 || fb0;
        double ld2 = 986.6386169780274;
if(fo1 != null){
          ad2 = fo1.m3();
}
        fb1 = ad3 < ad4;
        lb1 = ab1 || ab2;
        ab3 = !ab4;
if(fo0 != null){
          fo0.m3(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
    if (fb0) {
        fb1 = fd1 < fd0;
        double ld0 = 484.82086459928576;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fb0 = !fb1;
        fd1 *= -1;
        Thought lo1 = Thought135.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
        fb0 = fb1 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
        lb0 = !fb0;
        double ld1 = 647.0139199255273;
        fb1 = ad1 < ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        lb0 = ld1 > ad1;
if(ao4 != null){
          ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        ld1 = ad1 - ad2;
if(ao4 != null){
          ao3 = ao4.m4();
}
        fb0 = fb1 && lb0;
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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[4][0] += fd1;
        fd0 *= -1;
        fd1 *= -1;
if(ao1 != null){
          ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        boolean lb0 = false;
        ab2 = ab3 || ab4;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
        double ld1 = 511.96241797410346;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ld1 = ao1.m3(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab2 = !ab3;
        ab4 = fb0 || fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought173.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    ad3 = ad4 - fd0;
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = fd1 < ad1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
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
    fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought38.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    fd0 *= -1;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    double ld1 = 929.2725388750113;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = ab1 || ab2;
    ab3 = ld1 > fd0;
    ab4 = fb0 || fb1;
    double ld2 = 967.3160889883278;

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
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought162.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld1 = 216.2577933785949;
    fb1 = fb0 || fb1;
    fb0 = ad3 > ad4;
    if (fb1) {
        fb0 = fb1 || fb0;
        Output.points[4][1] -= fd0;
        Thought lo2 = Thought225.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fd1 = fo0.m3(ld1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
        if (fb0) {
}}
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
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    lb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
        Thought lo1 = Thought216.getInstance(fo0, fo1, fo0, fo1);
        Output.points[4][2] -= ad4;
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
    fd1 = fd0 - fd1;
    Output.points[4][3] += fd0;
    boolean lb0 = true;
    Output.points[4][4] -= fd1;
    fb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
    Thought lo1 = Thought153.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = lb0 && fb0;
if(ao3 != null){
      ao3.m1(fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        double ld4 = 905.7610081051557;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(ld4, fd0, fd1, ld4);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld4, fd0);
}
        fd1 = ld4 - fd0;
if(fo0 != null){
          fo0.m1();
}
        boolean lb5 = true;
        fd1 = ld4 + fd0;
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
    Thought lo0 = Thought185.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ao1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[4][5] += ad2;
    boolean lb1 = true;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought348.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m1(fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    fb0 = ad3 < ad4;
    boolean lb3 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb3);
}
    double ld4 = 953.3302059709675;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb3);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld4, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 && lb1;
if(ao3 != null){
      ao3.m3(lb3, fb0, fb1, lb1);
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
    double ld0 = 921.2174608869888;
    if (ab2) {
        boolean lb1 = false;
        double ld2 = 235.34558472814976;
        ab2 = ab3 || ab4;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld2, ld0, fd0, fd1, fb1, lb1, ab1, ab2);
}
        ld2 = ld0 + fd0;
if(ao1 != null){
          fd1 = ao1.m3(ld2, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ld2 = ao2.m3(ao3, ao4, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        ab4 = fb0 || fb1;
if(fo1 != null){
          ld0 = fo1.m3(fd0, fd1, ld2, ld0);
}
        if (lb1) {
            Output.points[4][6] += fd0;
            ab1 = ab2 && ab3;
if(ao1 != null){
              ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld2, ld0, fd0);
}
            fb0 = fd1 < ld2;
            Thought lo3 = Thought77.getInstance();
            ld0 = fd0 - fd1;
if(fo1 != null){
              fb1 = fo1.m2(lb1, ab1, ab2, ab3);
}
            ld2 = ld0 - fd0;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ld0, fd0, ab4, fb0, fb1, lb1);
}
            ab1 = fd1 < ld2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought125.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
        double ld1 = 710.3078664786456;
if(fo1 != null){
          ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
        Output.points[4][7] += ad4;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(ld1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          ld1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3();
}
    double ld0 = 53.44528176979086;
    Output.points[4][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo1 = Thought300.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);

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
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = fd0 < fd1;
        fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        if (ab2) {
            Thought lo0 = Thought56.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
            Thought lo1 = Thought33.getInstance();
            ab3 = !ab4;
            double ld2 = 773.0839635197628;
            boolean lb3 = true;
            ld2 *= -1;
            for(int i1=0; i1<10; i1++){
                ab4 = fb0 || fb1;
                lb3 = ab1 && ab2;
if(fo1 != null){
                  fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb3, ab1, ab2, ab3);
}
                for(int i2=0; i2<10; i2++){
if(fo0 != null){
                      fo0.m3(fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
                      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
                      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
                    fb0 = fb1 || lb3;
if(fo1 != null){
                      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
if(fo0 != null){
                      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
}}}}
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
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        fb1 = ad4 > fd0;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 && fb0;
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
        fb1 = fb0 || fb1;
        }
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    ad3 = ad4 + fd0;
    for(int i1=0; i1<10; i1++){
        fd1 = ad1 + ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ad4 *= -1;
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    ab1 = fd1 > ad1;
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
    Output.points[5][0] -= ad2;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
}
    double ld1 = 894.5903952040478;
    Thought lo2 = Thought330.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    ld1 = ad1 - ad2;
    ad3 *= -1;
    if (fb1) {
        lb0 = ad4 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
        ad1 = ad2 + ad3;
        ab2 = ab3 && ab4;
        fb0 = ad4 > fd0;
        fd1 = ld1 - ad1;
        boolean lb3 = false;
        ad2 = ad3 - ad4;
        fb0 = !fb1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought331.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld2 = 895.2882502408487;
    Output.points[5][1] -= ld2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought280.getInstance(fb0, fb1, lb0, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ld2 - fd0;
    double ld4 = 460.73985690586585;
    Thought lo5 = Thought98.getInstance(fd0, fd1, ld2, ld4, lb0, fb0, fb1, lb0);
    fd0 = fd1 - ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    double ld6 = 379.70560932463934;
    Output.points[5][2] -= ld4;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[5][3] += ld6;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ld2, ld4);
}
    ld6 *= -1;
    lb0 = fb0 && fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought349.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    fb0 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought266.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        lb0 = !fb0;
        ad3 *= -1;
        ad4 = fd0 + fd1;
        ad1 *= -1;
        fb1 = ad2 < ad3;
        double ld3 = 945.7767593490955;
        lb0 = ad3 < ad4;
        fb0 = fd0 < fd1;
        boolean lb4 = false;
        fb0 = fb1 && lb4;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ld3, ad1, ad2, ad3);
}
        ad4 *= -1;
        double ld5 = 560.2760283052918;
        double ld6 = 789.9298539544772;
        lb0 = ad3 > ad4;
        fb0 = fd0 < fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld0 = 62.41642912413305;
    ld0 = fd0 + fd1;
    ab1 = !ab2;
if(ao1 != null){
      ld0 = ao1.m3();
}
    Thought lo1 = Thought47.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought145.getInstance(ld0, fd0, fd1, ld0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ld0 = ao3.m3(ab4, fb0, fb1, lb2);
}
        ab1 = ab2 || ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    lb2 = fd1 > ld0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && lb2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    double ld0 = 338.8421201482882;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    double ld1 = 896.3040066359929;
    Thought lo2 = Thought51.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, ad1, ad2);
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld3 = 930.3358767998542;
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
if(ao3 != null){
      fb0 = ao3.m2(fb1, ab1, ab2, ab3);
}
    boolean lb4 = true;
    boolean lb5 = true;
        ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, fb0, fb1, lb4, lb5);
}
    ab1 = !ab2;
if(ao4 != null){
      ab3 = ao4.m2(ld3, ad1, ad2, ad3, ab4, fb0, fb1, lb4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb5, ab1, ab2, ab3);
}
    Output.points[5][4] -= ad4;
    ab4 = fb0 && fb1;
    Thought lo6 = Thought253.getInstance(fo0, fo1, ao1, ao2);
    double ld7 = 72.51923965979461;
    ad4 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, ld3);
}
    ld7 *= -1;

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
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2();
}
        fd1 *= -1;
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
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb1 = true;
    Thought lo2 = Thought62.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    Thought lo3 = Thought300.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb4, fb0);
}
    double ld5 = 977.9230364930798;
    Thought lo6 = Thought366.getInstance(fo1, fo0, fo1, fo0);
    fb1 = lb0 || lb1;

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
          fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[5][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
        Output.points[5][6] += fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo0 = Thought208.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);

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
