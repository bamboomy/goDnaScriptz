package genetic;
import java.util.ArrayList;
class Thought152 extends Thought{
private static ArrayList<Thought152> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 514.7560575529186;
private double fd1 = 512.4764133278624;
private Thought fo0 = null;
private Thought fo1 = null;
Thought152 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought152 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought152 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought152 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought152 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought152 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought152 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought152 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought152 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought152 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought152 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought152 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought152 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought152 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought152 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought152 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought152 instance = new Thought152 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[6][7] -= fd1;
    fd0 *= -1;
    Thought lo1 = Thought354.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = fd1 < fd0;
    Output.points[6][8] -= fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
    lb2 = !fb0;
    fb1 = lb0 || lb2;

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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    Thought lo0 = Thought100.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[7][0] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought255.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 120.32273317781763;
    Thought lo3 = Thought339.getInstance(fd0, fd1, ld2, fd0);
    fd1 *= -1;
    Output.points[7][1] += ld2;
    Output.points[7][2] += fd0;
    ab3 = fd1 > ld2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    if (lb1) {
        fb0 = !fb1;
        double ld2 = 955.1081177539116;
        Output.points[7][3] += ad2;
        lb0 = lb1 && fb0;
        fb1 = ad3 > ad4;
        Thought lo3 = Thought333.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb4 = true;
        boolean lb5 = true;
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld2, ad1, ad2);
}
        lb4 = ad3 > ad4;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 164.95905951471786;
if(fo0 != null){
      ld0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    Thought lo1 = Thought125.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m3(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    double ld3 = 97.07742440124329;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo4 = Thought360.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = ld0 > ld3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = !lb2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb5 = !ab1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, lb5, ab1);
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
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    Thought lo1 = Thought71.getInstance(fd0, fd1, fd0, fd1);
    double ld2 = 729.1683318396731;
    ld2 = fd0 + fd1;

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
    ad1 = ad2 + ad3;
        Thought lo0 = Thought355.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    ad2 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    double ld1 = 864.4809343941566;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fd1 = ld1 - ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = ld1 > ad1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb2 = false;
    Output.points[7][4] += ad2;

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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought346.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    boolean lb1 = false;
    Output.points[7][5] += fd0;
    lb1 = ab1 && ab2;
        boolean lb2 = false;
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, lb2, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1);
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
    boolean lb0 = false;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[7][6] += fd0;
    boolean lb1 = true;
    ab4 = fb0 && fb1;
        double ld2 = 54.49536997773827;
    Thought lo3 = Thought377.getInstance(lb0, lb1, ab1, ab2);
    double ld4 = 740.833457860084;
    Thought lo5 = Thought309.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
    Thought lo6 = Thought81.getInstance(ld4, ad1, ad2, ad3, lb0, lb1, ab1, ab2);

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
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    double ld1 = 969.5996172972319;
    double ld2 = 370.4248258757792;
    Thought lo3 = Thought396.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld1, ld2);
}
    fd0 = fd1 + ld1;
    ld2 = fd0 - fd1;
    ld1 *= -1;
    ld2 *= -1;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
        boolean lb4 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    Thought lo5 = Thought311.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb4, fb0);
}
    ld1 = ld2 + fd0;

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
    Thought lo0 = Thought368.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    Thought lo4 = Thought146.getInstance();
    ab4 = fb0 && fb1;
    fd1 *= -1;
            fd0 = fd1 - fd0;
        lb1 = lb2 && lb3;

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
    Output.points[7][7] -= ad2;
    double ld0 = 286.1288217100589;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 || fb0;
    boolean lb3 = true;
    fb0 = !fb1;
    lb1 = !lb2;
    ad2 = ad3 - ad4;
    lb3 = fd0 > fd1;
    boolean lb4 = false;
    lb4 = !fb0;
    ld0 = ad1 - ad2;
    double ld5 = 100.08240584453618;
    Output.points[7][8] += ad2;
    ad3 *= -1;
    Thought lo6 = Thought296.getInstance(fb1, lb1, lb2, lb3);
    for(int i0=0; i0<10; i0++){
        lb4 = fb0 && fb1;
        boolean lb7 = true;
        ad4 *= -1;
}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 33.09289249629663;
    Output.points[8][0] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
        fd0 = fd1 + ld0;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        fd0 = fd1 - ld0;
        if (ab4) {
            Thought lo3 = Thought153.getInstance(fb0, fb1, lb2, lb1);
if(fo0 != null){
              ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb1, lb2, lb1, ab1);
}
}}
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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought254.getInstance();
    boolean lb1 = false;

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
    ad2 = ad3 + ad4;
    Thought lo0 = Thought51.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought151.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 *= -1;
    boolean lb2 = false;
    Output.points[8][1] += ad4;
    lb2 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
    Output.points[8][2] += ad4;
    lb2 = fb0 || fb1;
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
}
    double ld3 = 729.4783427517117;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = ad4 < fd0;

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
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    double ld1 = 922.8638585950017;
    Thought lo2 = Thought82.getInstance();
    lb0 = fd0 < fd1;
    ab1 = ld1 < fd0;
    fd1 *= -1;
    ab2 = ld1 > fd0;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
            Output.points[8][3] -= ad2;
    ad3 = ad4 - fd0;

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
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = !fb0;
    fb1 = !lb0;

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
    Thought lo0 = Thought171.getInstance(ab2, ab3, ab4, fb0);
    double ld1 = 209.12877766930097;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    if (fb1) {
        boolean lb2 = true;
        fd0 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb2);
}
        ab1 = ab2 || ab3;
        double ld3 = 559.407716852826;
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - ld3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb2 = ld1 > fd0;
        fd1 *= -1;
        double ld5 = 182.60590452815183;
        lb4 = !ab1;
        ab2 = ld3 < ld5;
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld3, ld5);
}
        ab3 = ld1 < fd0;
        fd1 *= -1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][4] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo0 = Thought296.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    Thought lo1 = Thought40.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 *= -1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought16.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0);
}
        for(int i1=0; i1<10; i1++){
            fd1 = ad1 - ad2;
            Thought lo0 = Thought187.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
            boolean lb1 = false;
            ad1 *= -1;
            Thought lo2 = Thought182.getInstance();
            Thought lo3 = Thought89.getInstance(lb1, ab1, ab2, ab3);
            double ld4 = 247.6220443333123;
if(fo0 != null){
              ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
            ab2 = !ab3;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld4, ad1, ab4, fb0, fb1, lb1);
}
            for(int i2=0; i2<10; i2++){
if(fo1 != null){
                  fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
                ad2 = ad3 - ad4;
                boolean lb5 = false;
                boolean lb6 = true;
if(fo0 != null){
                  fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
                ab3 = ab4 || fb0;
                Output.points[8][5] += fd1;
if(fo1 != null){
                  ld4 = fo1.m3(ad1, ad2, ad3, ad4);
}
                Thought lo7 = Thought247.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ad1);
                ad2 = ad3 + ad4;
                fb1 = fd0 < fd1;
                ld4 *= -1;
if(fo0 != null){
                  ad1 = fo0.m3();
}
if(fo1 != null){
                  fo1.m3(lb5, lb6, lb1, ab1);
}
}}}
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
    Thought lo0 = Thought311.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = !lb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = fd1 < fd0;

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
    Output.points[8][6] -= ad1;
    ad2 *= -1;
    ad3 *= -1;
    fb0 = fb1 && fb0;
    Output.points[8][7] -= ad4;
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Output.points[8][8] -= fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          lb0 = ao2.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
        double ld1 = 905.3620571437071;
        fb1 = lb0 && fb0;
        boolean lb2 = false;
        double ld3 = 399.0081074720875;
        Thought lo4 = Thought314.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb0);
        boolean lb5 = false;
        ad1 = ad2 - ad3;
        Thought lo6 = Thought323.getInstance(ao1, ao2, ao3, ao4);
        lb0 = ad4 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(ld1, ld3, ad1, ad2);
}
        double ld7 = 890.2254767911148;
        boolean lb8 = true;
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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m1();
}
    Thought lo0 = Thought330.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    Output.points[0][0] -= fd0;
    ab2 = fd1 > fd0;
    boolean lb1 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 || ab1;
    Thought lo2 = Thought171.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    Output.points[0][1] += fd0;
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    ab4 = !fb0;
    boolean lb3 = false;
    fb0 = fd1 < fd0;
    fb1 = !lb1;
        lb3 = !ab1;
    Output.points[0][2] += fd1;
    ab2 = fd0 < fd1;
        for(int i0=0; i0<10; i0++){
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        Thought lo2 = Thought120.getInstance();
        lb1 = lb0 && ab1;
if(ao4 != null){
          ad4 = ao4.m3(ab2, ab3, ab4, fb0);
}
        if (fb1) {
            lb1 = lb0 && ab1;
            ab2 = ab3 || ab4;
if(fo0 != null){
              fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb0);
}
            double ld3 = 874.0055522558699;
if(ao4 != null){
              ad3 = ao4.m3(ad4, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
            ad1 = ad2 + ad3;
            fb0 = fb1 || lb1;
            } else if (lb0) {
            ab1 = fd0 > fd1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
            ad1 = ad2 + ad3;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        boolean lb0 = true;
        lb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || lb0;
        fd0 = fd1 - fd0;
        boolean lb1 = false;
        lb1 = fb0 || fb1;
        lb0 = lb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
        Thought lo2 = Thought75.getInstance(lb0, lb1, fb0, fb1);
        boolean lb3 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb3, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb0;
        lb1 = fd1 < fd0;
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
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
    double ld0 = 421.439129654721;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    double ld1 = 363.023107132532;
    Thought lo2 = Thought30.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
if(fo0 != null){
      fo0.m3();
}
    Output.points[0][3] += ld1;
    ab2 = !ab3;
    Thought lo3 = Thought270.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
    double ld4 = 284.6189177799941;
    fb1 = ab1 || ab2;

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
    Thought lo0 = Thought284.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    Output.points[0][4] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    lb1 = fb0 || fb1;
    double ld2 = 585.030649393871;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    ld2 = ad1 - ad2;
    fb1 = !lb1;
    Thought lo3 = Thought337.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
    ld2 = ad1 + ad2;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    fb1 = !ab1;
    ab2 = ad2 > ad3;
    if (ab3) {
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
        Thought lo0 = Thought370.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
        ad2 = ad3 + ad4;
if(fo0 != null){
          ab4 = fo0.m2();
}
        fb0 = !fb1;
        ab1 = ab2 || ab3;
        fd0 = fd1 + ad1;
        ab4 = fb0 && fb1;
if(fo1 != null){
          ad2 = fo1.m3(ab1, ab2, ab3, ab4);
}
        ad3 = ad4 - fd0;
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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    double ld2 = 530.9367747992255;
    fd0 *= -1;
    Output.points[0][5] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld2);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
    lb1 = ld2 > fd0;
    if (fb0) {
        Thought lo3 = Thought299.getInstance();
        double ld4 = 706.092585130619;
if(ao2 != null){
          fd0 = ao2.m3(fb1, lb0, lb1, fb0);
}
        fd1 = ld4 - ld2;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld4, ld2, fb1, lb0, lb1, fb0);
}
        boolean lb5 = false;
        Output.points[0][6] -= fd0;
if(ao2 != null){
          fd1 = ao2.m3(ld4, ld2, fd0, fd1, fb0, fb1, lb5, lb0);
}
        Output.points[0][7] += ld4;
        lb1 = ld2 < fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb5, lb0);
}
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
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
        fb0 = fb1 || fb0;
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    Thought lo1 = Thought347.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m1(lb2, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
        boolean lb3 = true;
        fd1 = ad1 + ad2;
        boolean lb4 = true;
        ad3 *= -1;
        ad4 = fd0 - fd1;
        boolean lb5 = false;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb4, lb5, lb0, lb2);
}
        Thought lo6 = Thought267.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb3, lb4);
        lb5 = !lb0;
        lb2 = !fb0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought227.getInstance(fd0, fd1, fd0, fd1);
    ab1 = fd0 < fd1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m3();
}
    fb0 = fb1 && lb1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    boolean lb3 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;

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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab2 = ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        boolean lb0 = false;
        ab2 = !ab3;
    double ld1 = 616.9703140385805;
    ab4 = ad4 < fd0;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    fd1 = ld1 - ad1;
    lb2 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, ld1, ad1, ad2, lb2, ab1, ab2, ab3);
}
    ad3 *= -1;
    double ld3 = 158.3538208228067;
    ab4 = ad3 > ad4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
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
    Output.points[0][8] += fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[1][0] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought240.getInstance();
    fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought171.getInstance(fb1, fb0, fb1, fb0);
        fd1 *= -1;
    double ld2 = 171.51670496697255;

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    double ld0 = 545.2410513088308;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
            fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    fd1 *= -1;
    double ld1 = 164.41142857571668;
    Output.points[1][1] -= ld0;
    ld1 *= -1;
    double ld2 = 987.274032867815;
    ld2 = fd0 + fd1;
    fb0 = ld0 < ld1;
    fb1 = ld2 < fd0;
    fb0 = !fb1;
    fd1 = ld0 + ld1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought359.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    fb0 = !fb1;
        fd0 = fd1 + fd0;
    double ld2 = 534.3713830620875;

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
