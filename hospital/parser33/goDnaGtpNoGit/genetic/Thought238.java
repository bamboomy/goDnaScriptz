package genetic;
import java.util.ArrayList;
class Thought238 extends Thought{
private static ArrayList<Thought238> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 897.596950294145;
private double fd1 = 11.021401064764245;
private Thought fo0 = null;
private Thought fo1 = null;
Thought238 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought238 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought238 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought238 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought238 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought238 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought238 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought238 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought238 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought238 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought238 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought238 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought238 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought238 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought238 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought238 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought238 instance = new Thought238 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought293.getInstance();
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    fd0 *= -1;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought118.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, lb3, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    double ld5 = 766.7156922427035;
    fd0 = fd1 + ld5;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld0 = 93.11431275837776;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][2] += fd1;
if(fo1 != null){
      fo1.m3(ld0, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    boolean lb1 = true;
    double ld2 = 162.77860778352542;
if(fo0 != null){
      fo1 = fo0.m4();
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
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Output.points[8][3] += ad2;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || ab1;
        Thought lo0 = Thought296.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ab2 = ab3 && ab4;
    Output.points[8][4] += ad1;
    double ld1 = 623.2877228483418;
    boolean lb2 = false;
    ab4 = ad1 < ad2;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought335.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    ab1 = fd0 > fd1;

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    lb0 = !fb0;
    fd1 *= -1;
    Thought lo1 = Thought220.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
if(ao1 != null){
          lb3 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb2);
}
    boolean lb4 = true;
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb2, lb3, lb4, fb0);
}
    if (fb1) {
        boolean lb5 = false;
        Thought lo6 = Thought373.getInstance(fo0, fo1, ao1, ao2, lb5, lb0, lb2, lb3);
        Output.points[8][5] -= fd0;
        fd1 *= -1;
        fd0 = fd1 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        for(int i0=0; i0<10; i0++){
            fd1 = fd0 - fd1;
            double ld7 = 380.0224696399426;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought325.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ad3 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    lb0 = ad2 < ad3;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    double ld0 = 918.2404905412327;
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought271.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo1.m3();
}
    double ld2 = 580.6423482951344;
    fb0 = !fb1;
    boolean lb3 = true;
    ld0 = ld2 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(lb3, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, ld2, fd0, fd1, ab4, fb0, fb1, lb3);
}
        ab1 = ab2 || ab3;
    ld0 *= -1;
if(ao1 != null){
      ao1.m2(ld2, fd0, fd1, ld0, ab4, fb0, fb1, lb3);
}
    boolean lb4 = true;
    lb4 = ld2 > fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    Thought lo5 = Thought51.getInstance(ao2, ao3, ao4, fo0, lb3, lb4, ab1, ab2);
    Thought lo6 = Thought224.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m1(fd1, ld0, ld2, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ld0, ld2, fd0);
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
    ab1 = ab2 || ab3;
    double ld0 = 711.9905807137598;
    ad1 = ad2 - ad3;
    double ld1 = 189.9173024390763;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[8][6] += ld0;
    Thought lo2 = Thought55.getInstance(ld1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ab4 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    ld0 = ld1 + ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ld1, ad1);
}
    Output.points[8][7] -= ad2;
    Thought lo3 = Thought165.getInstance();
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
    ad3 *= -1;
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 320.6579699817649;
    double ld1 = 465.9602856177494;
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        Output.points[8][8] += ld1;
        fd0 = fd1 + ld0;
        boolean lb2 = false;
        fb0 = fb1 && lb2;
        boolean lb3 = false;
if(fo0 != null){
          lb3 = fo0.m2(ld1, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
        Output.points[0][0] += ld1;
        Output.points[0][1] += fd0;
        Thought lo4 = Thought31.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
        boolean lb5 = true;
        fd1 = ld0 + ld1;
if(fo1 != null){
          lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
        fb0 = fd1 > ld0;
        fb1 = ld1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld1, fd0);
}
        fd1 = ld0 - ld1;
        Output.points[0][2] -= fd0;
        fd1 = ld0 - ld1;
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought78.getInstance();
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = lb0 && ab1;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    double ld3 = 504.59137487301194;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought76.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
    fd1 = ld3 + fd0;
    fd1 = ld3 + fd0;
    Thought lo5 = Thought228.getInstance(fo1, fo0, fo1, fo0);
    double ld6 = 676.7016693661714;
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld3, ld6);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    double ld0 = 840.1026163171755;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought177.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
    ad4 = fd0 - fd1;
    boolean lb3 = true;
    ld0 = ad1 + ad2;
    lb1 = ad3 < ad4;
if(fo0 != null){
      lb3 = fo0.m2(fd0, fd1, ld0, ad1, fb0, fb1, lb1, lb3);
}
    fb0 = !fb1;
    Thought lo4 = Thought50.getInstance(fo1, fo0, fo1, fo0, lb1, lb3, fb0, fb1);

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 614.1512407180458;
    Output.points[0][3] += fd0;
    fd1 = ld0 + ad1;

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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought233.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    double ld2 = 194.97502567716595;
    fb1 = fd0 < fd1;
    ld2 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fb1 = !fb0;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    Output.points[0][4] += ad4;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought47.getInstance();
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    double ld1 = 83.99188844308178;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought381.getInstance(fb0, fb1, fb0, fb1);
    fb0 = ad3 < ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fd0 = fd1 - ld1;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought208.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    ad1 *= -1;
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
    Output.points[0][5] -= ad1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought345.getInstance();

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
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought180.getInstance(ab3, ab4, fb0, fb1);
    ab1 = fd0 < fd1;
    fd0 *= -1;
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    double ld1 = 426.9828509800072;
    Output.points[0][6] += ld1;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    if (fb0) {
        Thought lo3 = Thought260.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          ld1 = ao1.m3(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
        fb1 = ld1 < fd0;
if(ao1 != null){
          fd1 = ao1.m3();
}
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
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad2 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought183.getInstance();
if(ao3 != null){
      ao3.m3(fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought179.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);

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
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      lb0 = fo0.m2();
}
    boolean lb1 = false;
    double ld2 = 570.8281215972917;
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb0);
}
    double ld3 = 399.59294127546883;
    ld3 = fd0 + fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    Thought lo1 = Thought209.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 || lb0;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 848.7417813541236;
    ab2 = ld2 < fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
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
    fb1 = ad1 > ad2;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought55.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    double ld0 = 736.6588846630559;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    lb1 = ab1 && ab2;
    Thought lo2 = Thought217.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    ab3 = ad2 > ad3;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1();
}
    boolean lb4 = true;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb5 = false;
    fb0 = fb1 && lb1;
    double ld6 = 565.792481709638;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb3, lb4, lb5, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld6, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb4, lb5, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld0, ld6, ad1, ad2);
}
    ad3 = ad4 - fd0;
    Thought lo7 = Thought305.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld6, ad1);
if(fo0 != null){
      fo0.m1();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought245.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 829.2996884299138;
    ld1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    ld1 *= -1;
    lb2 = fd0 < fd1;
    ld1 *= -1;
    fb0 = fd0 < fd1;
    ld1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 < ld1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
    boolean lb3 = true;
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(lb3, lb4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, lb2, lb3, lb4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    Thought lo0 = Thought19.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 *= -1;
    double ld1 = 453.70491331017644;
    double ld2 = 582.0254933084923;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb3);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, ad1, ad2);
}
    fb1 = ad3 > ad4;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld2);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao4.m3(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought323.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought189.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought174.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb3 = false;
    Thought lo4 = Thought381.getInstance(lb3, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb3);
}
    ab1 = !ab2;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb3 = fd0 < fd1;
    ab1 = fd0 > fd1;
    Thought lo5 = Thought143.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    lb3 = !ab1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(fb0, fb1, lb3, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    ab1 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    boolean lb1 = true;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[0][7] += ad4;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[0][8] += fd1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought195.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    double ld1 = 452.44084513478157;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3();
}
    boolean lb2 = true;
    Output.points[1][0] -= ld1;
    Thought lo3 = Thought146.getInstance(lb2, fb0, fb1, lb2);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    double ld4 = 977.3094847375716;

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
        Thought lo0 = Thought108.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[1][1] -= fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Output.points[1][2] += fd0;
    double ld1 = 566.5672995423739;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld3 = 795.9347404828225;
    Output.points[1][3] += fd0;
    fd1 *= -1;
    ld1 *= -1;
    ab4 = ld3 < fd0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld3, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld3, fd0, fd1);
}
    ld1 = ld3 + fd0;
    fd1 *= -1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = ld1 > ld3;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, lb4, ab1);
}
    Thought lo5 = Thought100.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3, ab2, ab3, ab4, fb0);
    boolean lb6 = false;
    fd0 = fd1 + ld1;
    fb0 = fb1 && lb2;
    Thought lo7 = Thought141.getInstance(ld3, fd0, fd1, ld1, lb4, lb6, ab1, ab2);

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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    boolean lb1 = false;
    ad2 *= -1;
    lb0 = ad3 < ad4;
    boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    lb0 = lb1 || lb2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought284.getInstance(fd0, fd1, ad1, ad2);
    fb0 = !fb1;
    boolean lb4 = true;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb5 = false;
    ad4 *= -1;
    double ld6 = 641.3409773743816;
if(fo0 != null){
      ad4 = fo0.m3();
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, lb4, lb5);
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
    boolean lb0 = false;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ad1;
    lb0 = ad2 > ad3;
    ab1 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    ab2 = !ab3;
    Thought lo2 = Thought246.getInstance(fo1, fo0, fo1, fo0);
    ab4 = !fb0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
    fd0 = fd1 + fd0;
    lb0 = !lb1;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    lb2 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
    fb0 = !fb1;

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
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[1][4] += ad1;
    ad2 *= -1;
    double ld0 = 925.4434412987869;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    double ld2 = 491.1387419820226;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought21.getInstance();
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb1 = ao1.m2(ab1, ab2, ab3, ab4);
}
    Output.points[1][5] += fd0;
    boolean lb1 = true;
    ab4 = fd1 < fd0;
    Thought lo2 = Thought163.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
    Output.points[1][6] += fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld3 = 706.4750642718619;

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
    Thought lo0 = Thought346.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    double ld1 = 745.9084052931656;
    ld1 = ad1 + ad2;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad4 *= -1;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    boolean lb2 = false;
    Thought lo3 = Thought245.getInstance(ab4, fb0, fb1, lb2);
    ab1 = fd1 < ld1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo4 = Thought118.getInstance(ld1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
        boolean lb5 = true;
    lb5 = ab1 && ab2;
    fd0 *= -1;
    double ld6 = 417.9946688953463;
    fd0 = fd1 + ld1;
    Thought lo7 = Thought280.getInstance(ao1, ao2, ao3, ao4);
    ld6 = ad1 + ad2;

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
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[1][7] += fd1;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = fd0 > fd1;
    lb1 = fd0 < fd1;
    Thought lo2 = Thought65.getInstance(fb0, fb1, lb0, lb1);
    fb0 = fb1 || lb0;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb3, lb4, fb0);
}
    fb1 = fd0 > fd1;

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
    double ld0 = 890.8240191940222;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 + fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    double ld1 = 539.5726021728675;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld0 = ld1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 < ld0;
    ld1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb2 = true;
    lb2 = !fb0;
    boolean lb3 = false;
    fb0 = ld0 > ld1;

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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 *= -1;
    fd0 *= -1;
    lb0 = !fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought231.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[1][8] -= fd1;
        lb0 = fd0 < fd1;
    lb1 = fb0 || fb1;
    Thought lo3 = Thought354.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo4 = Thought108.getInstance();
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    lb1 = fd0 < fd1;

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
