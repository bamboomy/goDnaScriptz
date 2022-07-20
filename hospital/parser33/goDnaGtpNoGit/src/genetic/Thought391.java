package genetic;
import java.util.ArrayList;
class Thought391 extends Thought{
private static ArrayList<Thought391> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 254.7610307551547;
private double fd1 = 51.58071331513316;
private Thought fo0 = null;
private Thought fo1 = null;
Thought391 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought391 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought391 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought391 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought391 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought391 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought391 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought391 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought391 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought391 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought391 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought391 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought391 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought391 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought391 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought391 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought391 instance = new Thought391 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    double ld1 = 676.723623727465;
    boolean lb2 = true;
    boolean lb3 = true;
    lb2 = ld1 < fd0;
    fd1 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[3][4] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    fb1 = lb0 || ab1;
    double ld1 = 464.3964571443703;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
        Thought lo1 = Thought38.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = ad4 < fd0;
    double ld2 = 744.568171802261;
    lb0 = fd0 > fd1;
    Output.points[3][5] -= ld2;
    fb0 = fb1 && lb0;
    boolean lb3 = true;
    lb3 = ad1 < ad2;
    ad3 = ad4 + fd0;
    Thought lo4 = Thought237.getInstance(fd1, ld2, ad1, ad2);
    ad3 = ad4 + fd0;
    Output.points[3][6] += fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo5 = Thought114.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2, fb0, fb1, lb0, lb3);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(fd1, ld2, ad1, ad2, fb0, fb1, lb0, lb3);
}
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb6, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
      fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ab2 = !ab3;
    ab4 = ad3 < ad4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1();
}
    ab2 = ad3 < ad4;
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
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
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0);
}
    Output.points[3][7] += fd1;
    Thought lo0 = Thought311.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
        } else if (fb1) {
        Output.points[3][8] += fd0;
        Thought lo1 = Thought118.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        Output.points[4][0] -= fd1;
        fd0 *= -1;
if(ao4 != null){
          fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Output.points[4][1] += ad2;
    fb0 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        Output.points[4][2] -= fd0;
        fb1 = !fb0;
        fb1 = fd1 > ad1;
        fb0 = ad2 < ad3;
        }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
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
    boolean lb0 = false;
    Output.points[4][3] -= fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought52.getInstance(fd0, fd1, fd0, fd1);
    ab1 = ab2 || ab3;
    Thought lo2 = Thought93.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought341.getInstance();
    Thought lo4 = Thought138.getInstance(ab4, fb0, fb1, lb0);
    ab1 = !ab2;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo5 = Thought278.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ab2 = ao4.m2();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    double ld6 = 204.7301567437235;

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
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    Output.points[4][4] += ad4;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 728.2908498733594;
    Thought lo1 = Thought190.getInstance();
    double ld2 = 781.3649882515272;
    fb1 = !fb0;
    ld0 *= -1;
    boolean lb3 = false;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
    Output.points[4][5] += ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, lb3, fb0, fb1, lb3);
}
    double ld4 = 186.77793314750238;

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
    if (lb0) {
        if (ab1) {
            boolean lb1 = false;
if(fo0 != null){
              fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
            } else {
            fb1 = lb0 || ab1;
            boolean lb2 = true;
            ab1 = !ab2;
            double ld3 = 880.0994306506706;
            double ld4 = 338.79386381075824;
            double ld5 = 823.2611574539055;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
            double ld6 = 379.1710320216099;
            lb2 = lb0 || ab1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Thought lo7 = Thought60.getInstance(ld4, ld5, ld6, fd0);
            ab2 = ab3 && ab4;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] -= ad2;
    double ld0 = 428.394159466884;
    ad2 *= -1;
    double ld1 = 853.6353268026401;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ld0 < ld1;
    Thought lo2 = Thought313.getInstance();
    fb1 = !fb0;
    boolean lb3 = true;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought60.getInstance(fd1, ld0, ld1, ad1, lb3, fb0, fb1, lb3);
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    double ld5 = 801.9381987567309;
        fb1 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld6 = 427.805932965964;
    lb3 = ad4 < fd0;
    fb0 = fb1 || lb3;
    fd1 = ld0 - ld1;
    fb0 = !fb1;
    boolean lb7 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought50.getInstance(ad1, ad2, ad3, ad4);
    Output.points[4][7] -= fd0;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought224.getInstance();
    Thought lo2 = Thought226.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    ad4 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 + fd1;
    Output.points[4][8] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 986.6970806087237;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb0) {
        fd1 = ld0 + fd0;
        Output.points[5][0] -= fd1;
        ld0 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        ld0 = fd0 + fd1;
        double ld1 = 198.47203776109916;
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
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    fb0 = !fb1;
    Output.points[5][1] += ad1;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;

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
    ab4 = fb0 || fb1;
    boolean lb0 = false;
    Thought lo1 = Thought259.getInstance(ao2, ao3, ao4, fo0);
    lb0 = fd0 > fd1;
    double ld2 = 214.3450157997942;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
    boolean lb3 = false;
    double ld4 = 983.9645689035942;
    lb3 = !ab1;
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought12.getInstance(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld2);
        ab2 = ab3 && ab4;
        ld4 *= -1;
if(fo1 != null){
          fo1.m2();
}
        Thought lo6 = Thought244.getInstance(fb0, fb1, lb0, lb3);
        fd0 = fd1 + ld2;
        ab1 = ld4 > fd0;
        ab2 = fd1 > ld2;
if(ao1 != null){
          ab3 = ao1.m2(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
        lb3 = ab1 && ab2;
        ab3 = ld4 > fd0;
        Thought lo7 = Thought88.getInstance(fd1, ld2, ld4, fd0, ab4, fb0, fb1, lb0);
        Output.points[5][2] -= fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
        ab4 = !fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought131.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    double ld1 = 210.64673513514884;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ab1 = ab2 && ab3;
    boolean lb2 = true;
    ab3 = ab4 && fb0;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought58.getInstance();
    ad4 = fd0 - fd1;

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
    Thought lo0 = Thought375.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    fb1 = !lb1;
    fb0 = fb1 || lb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
        }
    fb1 = lb1 || fb0;
    Output.points[5][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    lb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought355.getInstance();
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb3, fb0, fb1);
}
    lb1 = fd0 > fd1;
    boolean lb4 = true;
    lb3 = !lb4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
}
    lb4 = fd0 < fd1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    fd0 *= -1;
        for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = fd0 > fd1;
        boolean lb0 = false;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
        fd0 *= -1;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought206.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ad2 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    boolean lb2 = true;
    ad3 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && lb2;
    if (fb0) {
        Thought lo3 = Thought13.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb4 = false;
        boolean lb5 = true;
if(fo0 != null){
          fo0.m2(lb2, fb0, fb1, lb4);
}
        for(int i0=0; i0<10; i0++){
            lb5 = lb0 || lb2;
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb4, lb5);
}
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, lb2, fb0, fb1);
}
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld0 = 421.1229479816872;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought269.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ad4 = fd0 + fd1;
    ab1 = ld0 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    double ld2 = 210.69278403293518;
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 > ld0;
    if (ab1) {
        ab2 = ab3 || ab4;
if(fo1 != null){
          ld2 = fo1.m3(ad1, ad2, ad3, ad4);
}
        if (fb0) {
            fb1 = ab1 && ab2;
            Thought lo3 = Thought114.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
            ab3 = ab4 && fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 783.1291027708071;
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ld0 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = ld0 + fd0;
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = fd1 < ld0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
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
    fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
    Thought lo0 = Thought93.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][4] -= ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought164.getInstance(ad4, fd0, fd1, ad1);
    fb1 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    ad2 = ad3 + ad4;
    lb2 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4();
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
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
        ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    Output.points[5][5] += fd1;
    ab3 = fd0 > fd1;
    ab4 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fb1 = !lb0;
if(ao3 != null){
          ab1 = ao3.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    Thought lo0 = Thought94.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought21.getInstance(ao3, ao4, fo0, fo1);
    Thought lo2 = Thought15.getInstance(fd1, ad1, ad2, ad3);
    Output.points[5][6] -= ad4;
    boolean lb3 = false;
    fb0 = fb1 && lb3;
    fd0 = fd1 + ad1;
    ab1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
    double ld5 = 448.323976845963;
    ab4 = fb0 && fb1;
    ad3 = ad4 - fd0;
    boolean lb6 = false;
        Thought lo7 = Thought210.getInstance(ao1, ao2, ao3, ao4, fd1, ld5, ad1, ad2);
    lb3 = lb4 && lb6;
if(fo0 != null){
          ad3 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld8 = 597.6119753652682;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought7.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought29.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      lb0 = fo0.m2();
}
    lb1 = fd1 < fd0;

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
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 835.6862989682019;
    fb0 = ld0 < fd0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 + fd1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 509.8773740644663;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[5][7] += ad1;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
    Output.points[5][8] -= ad3;
    boolean lb2 = false;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought50.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    Thought lo3 = Thought9.getInstance(fo0, fo1, fo0, fo1);
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fd0 = fd1 + ad1;
    fb1 = lb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, lb1, lb2, ab1);
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
    fd1 = fd0 + fd1;
    fd0 *= -1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    Output.points[6][0] -= fd1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m2();
}
    Thought lo1 = Thought97.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    double ld2 = 442.7974157147498;
    fb0 = fb1 && lb0;
    Thought lo3 = Thought291.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[6][1] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    double ld1 = 861.1056779873542;

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
    boolean lb0 = false;
    double ld1 = 725.0924108732617;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
    fd1 = ld1 + fd0;
    Output.points[6][2] -= fd1;
    ld1 *= -1;
    fd0 *= -1;
    Thought lo2 = Thought310.getInstance(fo1, ao1, ao2, ao3);
    if (ab4) {
if(ao4 != null){
          ao4.m3(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
}
        if (fb0) {
            fb1 = fd0 > fd1;
            lb0 = ab1 || ab2;
            ab3 = !ab4;
            Thought lo3 = Thought185.getInstance();
            fb0 = ld1 < fd0;
            Output.points[6][3] += fd1;
            fb1 = ld1 < fd0;
            boolean lb4 = false;
            lb4 = fd1 > ld1;
            lb0 = fd0 < fd1;
            boolean lb5 = false;
            double ld6 = 850.0999643544179;
            ld6 *= -1;
}}
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
    double ld0 = 543.7126397184684;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m1(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    ad1 *= -1;
    fb1 = ad2 > ad3;
    Output.points[6][4] += ad4;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    lb1 = !ab1;
    boolean lb2 = false;
    Thought lo3 = Thought284.getInstance(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    if (fb0) {
        fb1 = !lb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
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
    fb0 = fd1 > fd0;
    fb1 = lb0 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought399.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2();
}
    fb1 = fd0 > fd1;
    lb0 = !fb0;
    fb1 = !lb0;
    double ld2 = 508.45070822091213;
            fb0 = ld2 > fd0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
    ld2 = fd0 - fd1;
    double ld3 = 943.7164152305972;
if(fo0 != null){
      lb0 = fo0.m2(ld2, ld3, fd0, fd1, fb0, fb1, lb0, fb0);
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
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought23.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    lb1 = !fb0;
    fb1 = fd0 > fd1;
    lb1 = fb0 || fb1;

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
    boolean lb0 = true;
    Output.points[6][5] -= fd0;
    boolean lb1 = false;
    double ld2 = 168.93664054758847;
    fd0 = fd1 + ld2;
    boolean lb3 = false;
    fd0 *= -1;
    lb0 = !lb1;
    Thought lo4 = Thought284.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
        lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb3, fb0);
}
    fb1 = ld2 < fd0;
    boolean lb5 = true;
    Thought lo6 = Thought131.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, lb0, lb1, lb3, lb5);
    fb0 = ld2 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2, fb1, lb0, lb1, lb3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
}
    Thought lo7 = Thought114.getInstance(fo1, fo0, fo1, fo0);
    boolean lb8 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1);
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
