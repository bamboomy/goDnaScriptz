package genetic;
import java.util.ArrayList;
class Thought40 extends Thought{
private static ArrayList<Thought40> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 876.7176407470537;
private double fd1 = 240.0025211174191;
private Thought fo0 = null;
private Thought fo1 = null;
Thought40 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought40 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought40 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought393.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    fd0 = fd1 + fd0;
    fb1 = !lb0;

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
    boolean lb0 = false;
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld1 = 231.81434940306562;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    ld1 *= -1;
    fd0 *= -1;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
          fo0.m1();
}
        fd0 = fd1 + ld1;
        Output.points[1][0] -= fd0;
        fd1 = ld1 - fd0;
if(fo1 != null){
          fo1.m3(fb1, lb0, lb2, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ld1 *= -1;
        fb1 = lb0 && lb2;
        fd0 *= -1;
        for(int i0=0; i0<10; i0++){
            Output.points[1][1] += fd1;
            double ld3 = 789.9479819864453;
if(fo1 != null){
              fo0 = fo1.m4(ld3, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
            fb0 = fb1 && lb0;
            }
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
        ab4 = !fb0;
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
    fb1 = ad1 > ad2;
    Thought lo0 = Thought26.getInstance(fo0, fo1, fo0, fo1);
        if (fb0) {
        fb1 = fb0 || fb1;
if(fo0 != null){
          fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb0 = fb1 || fb0;
        fb1 = fd0 > fd1;
        fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
        fb0 = !fb1;
if(fo0 != null){
          fb0 = fo0.m2();
}
        fb1 = ad1 > ad2;
        boolean lb1 = false;
        if (lb1) {
            Thought lo2 = Thought164.getInstance(fb0, fb1, lb1, fb0);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
              fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
            fd0 = fd1 - ad1;
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
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ab4 = fo1.m2(ad4, fd0, fd1, ad1);
}
        fb0 = fb1 || ab1;
        ab2 = ad2 > ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ab3 = fo0.m2();
}
        boolean lb0 = false;
        ab3 = fd0 < fd1;
        ab4 = !fb0;
        ad1 = ad2 - ad3;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
            ab3 = ab4 && fb0;
            fb1 = ad4 < fd0;
            fd1 = ad1 + ad2;
            boolean lb1 = false;
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
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
    Output.points[1][2] += ad2;
    boolean lb0 = true;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Output.points[1][3] += ad1;
    double ld1 = 861.304467406042;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    lb0 = !fb0;
    fd0 = fd1 + ld1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    double ld3 = 98.23925569331571;
    ld3 = ad1 - ad2;
    fb0 = fb1 || lb0;
    lb2 = fb0 && fb1;
    ad3 *= -1;

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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought333.getInstance();
    Output.points[1][4] += fd0;
    ab1 = ab2 && ab3;
    Output.points[1][5] += fd1;
    fd0 *= -1;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
        Output.points[1][6] += fd1;
    boolean lb1 = false;
    ab2 = fd0 < fd1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought18.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
        double ld1 = 289.5658727918727;
    Output.points[1][7] -= ad2;
    ab4 = ad3 > ad4;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    double ld3 = 426.3764380068955;
    ld1 *= -1;
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = !lb2;
    ld3 = ad1 + ad2;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m1(ab4, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld3, ad1, ad2, ab4, fb0, fb1, lb2);
}
    ab1 = !ab2;
    Thought lo4 = Thought118.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    Thought lo0 = Thought158.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought308.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo2 = Thought94.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
        }
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld0 = 522.4138540396034;
    ab3 = !ab4;
        fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
    fb0 = fd1 < ad1;
    if (fb1) {
        boolean lb2 = true;
        ad2 *= -1;
        ad3 *= -1;
        ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
        Thought lo3 = Thought277.getInstance(lb2, lb0, lb1, fb0);
        ad4 = fd0 - fd1;
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = !ab1;
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 + ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought163.getInstance();
    lb0 = fb0 || fb1;
    double ld2 = 774.8477536164869;
    lb0 = fb0 || fb1;
if(ao1 != null){
      ld2 = ao1.m3(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
    double ld3 = 536.8034105781281;
    boolean lb4 = false;
    lb0 = lb4 || fb0;
    fb1 = fd0 < fd1;
    lb0 = ld2 < ld3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, ld3, lb4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb0);
}
    fd0 *= -1;
    Output.points[1][8] -= fd1;
    lb4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb5 = false;
    double ld6 = 16.557036822721376;
if(ao3 != null){
      ao3.m1(ld2, ld3, ld6, fd0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ld2, ld3, ld6);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb4, lb5);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ld3, fb0, fb1, lb0, lb4);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought329.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought299.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[2][0] += ad4;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad1 < ad2;
    boolean lb3 = true;
    fb0 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, lb3, fb0);
}
    fb1 = lb2 && lb3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
    ad1 *= -1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
          ao1.m2(fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    lb0 = !lb1;
    double ld3 = 227.57523525906467;
    lb2 = ab1 && ab2;
if(ao3 != null){
      ao3.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3, lb0, lb1, lb2, ab1);
}
    ab2 = fd0 < fd1;
    ld3 = fd0 - fd1;
    ab3 = !ab4;
if(fo0 != null){
      ao4 = fo0.m4(ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    Output.points[2][1] += ad1;
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    ad2 = ad3 - ad4;
    fb1 = !lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = ab1 || ab2;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Output.points[2][2] += fd0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought358.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
    double ld0 = 59.85868620098223;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        ab1 = ld0 > fd0;
        ab2 = ab3 && ab4;
        fb0 = fd1 < ld0;
if(fo0 != null){
          fo0.m1(fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        Output.points[2][3] -= fd0;
        boolean lb1 = true;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
        }
    fb0 = fd0 < fd1;
    Thought lo2 = Thought61.getInstance(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    if (ab2) {
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
    boolean lb0 = false;
    double ld1 = 604.129492499493;
    lb0 = fb0 || fb1;
    boolean lb2 = true;
    ld1 *= -1;
    lb0 = lb2 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought256.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    boolean lb4 = false;
    Output.points[2][4] -= ad3;
    fb0 = ad4 > fd0;
    fd1 = ld1 - ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    boolean lb5 = true;
    Thought lo6 = Thought67.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, lb4);
}
    Output.points[2][5] -= fd1;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb5, fb0, fb1, lb0);
}
    boolean lb7 = true;
    lb2 = !lb4;

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
      ab2 = fo0.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    ab2 = !ab3;
    ad4 *= -1;
    ab4 = !fb0;
    if (fb1) {
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
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    boolean lb0 = false;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    fb1 = lb0 || fb0;
    Output.points[2][6] += fd0;
    fb1 = !lb0;
    boolean lb1 = true;
    Thought lo2 = Thought131.getInstance(lb1, fb0, fb1, lb0);
    boolean lb3 = true;
    fd1 = fd0 + fd1;

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
    fb1 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = !fb0;
    double ld0 = 994.0660995112747;
    boolean lb1 = true;
    Thought lo2 = Thought76.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
    ad4 *= -1;
    fb1 = fd0 > fd1;
    ld0 = ad1 + ad2;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
}
        Output.points[2][7] -= ad4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 497.3125517549755;
    ab1 = fd0 > fd1;
if(ao2 != null){
      ld0 = ao2.m3();
}
    double ld1 = 210.00232442705416;
    ld1 = fd0 + fd1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ld0 > ld1;
    Thought lo2 = Thought201.getInstance(ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    double ld3 = 784.4350458710828;
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ab1 = !ab2;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought203.getInstance();
    Output.points[2][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb3 = false;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought291.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fb0 = fd1 < fd0;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, lb2, fb0);
}
        fb1 = fd1 < fd0;
        fd1 *= -1;
        lb1 = !lb2;
        double ld3 = 797.3265464184168;
        fb0 = fb1 && lb1;
        ld3 = fd0 + fd1;
        ld3 = fd0 + fd1;
        ld3 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb1);
}
        Thought lo4 = Thought32.getInstance(fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb1);
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
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    ab1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    boolean lb1 = true;
    fd0 *= -1;
    Thought lo2 = Thought232.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    Output.points[3][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 619.3319884508595;
    Output.points[3][1] += fd0;
    boolean lb4 = false;
    Thought lo5 = Thought244.getInstance(fd1, ld3, fd0, fd1);
    ld3 = fd0 + fd1;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3();
}
    double ld2 = 942.2735273933408;
    lb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
    ld2 = ad1 + ad2;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;

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
    Output.points[3][2] += fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
        boolean lb0 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought240.getInstance(ao1, ao2, ao3, ao4);
    fd1 *= -1;
    Output.points[3][3] -= fd0;
    lb0 = !fb0;
    fb1 = fd1 < fd0;
    lb0 = fd1 > fd0;
    Thought lo2 = Thought3.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought104.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    Thought lo4 = Thought185.getInstance();
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    Thought lo1 = Thought141.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 > fd1;
    double ld2 = 161.61420568570907;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3);
}
    boolean lb3 = true;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb3);
}
        fd0 *= -1;
    boolean lb4 = true;
    boolean lb5 = false;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, lb4, lb5, fb0, fb1);
}
    lb0 = lb3 || lb4;
    lb5 = !fb0;
    Thought lo6 = Thought265.getInstance(ad4, fd0, fd1, ld2, fb1, lb0, lb3, lb4);
    lb5 = fb0 && fb1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb3, lb4, lb5);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb7 = true;
    fb0 = !fb1;
    lb0 = ad2 < ad3;
    lb3 = ad4 > fd0;
    lb4 = lb5 && lb7;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(ld2, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    for(int i0=0; i0<10; i0++){
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
if(ao1 != null){
      fd1 = ao1.m3();
}
    double ld0 = 536.4146498557329;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    double ld1 = 519.0323249726686;
    ld0 = ld1 + fd0;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
    double ld2 = 900.3680283328911;
    boolean lb3 = false;
    lb3 = ab1 && ab2;
    ab3 = ab4 && fb0;
    ld0 = ld1 + ld2;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4();
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
    Output.points[3][4] += fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    Output.points[3][5] -= fd1;
    Thought lo1 = Thought139.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld2 = 141.39406805609417;
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought330.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    Output.points[3][6] += fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[3][7] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || lb1;
    Thought lo4 = Thought279.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    lb2 = fd0 > fd1;
    Output.points[3][8] -= fd0;

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
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    Output.points[4][0] += fd0;
    fb0 = !fb1;
        Thought lo1 = Thought222.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    double ld2 = 498.4731522622714;
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb3);
}
    fd1 *= -1;
    fb0 = !fb1;
    Output.points[4][1] -= ld2;
    Thought lo4 = Thought331.getInstance(fo0, fo1, fo0, fo1, lb0, lb3, fb0, fb1);

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
